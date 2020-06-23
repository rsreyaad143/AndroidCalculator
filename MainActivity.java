package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button clear, memory_plus, memory, delete, seven, eight, nine, division, four, five, six, multiplication, one, two, three, minus, zero, dot, equal, plus;
    TextView result;
    boolean first_input = false;
    boolean first_action = false;
    boolean val1 = false;

    double value1 = 0.0;
    double value2 = 0.0;
    double memoryStore = 0.0;
    double memoryStore_plus =0.0;
    String mStore = "";
    String sign = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeReference();

        result.setText("0");
        first_input = true;
        first_action = true;


        clear.setOnClickListener(this);
        memory_plus.setOnClickListener(this);
        memory.setOnClickListener(this);
        delete.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        division.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        minus.setOnClickListener(this);
        zero.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);
        plus.setOnClickListener(this);


    }

    private void initializeReference() {
        result = findViewById(R.id.result);
        clear = findViewById(R.id.c);
        memory_plus = findViewById(R.id.m_plus);
        memory = findViewById(R.id.m);
        delete = findViewById(R.id.del);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        division = findViewById(R.id.division);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        multiplication = findViewById(R.id.multiplication);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        minus = findViewById(R.id.minus);
        zero = findViewById(R.id.zero);
        dot = findViewById(R.id.dot);
        equal = findViewById(R.id.equal);
        plus = findViewById(R.id.plus);
    }

    @Override
    public void onClick(View view) {


        if (view.getId() == R.id.one){

            if (first_input){
                result.setText("1");
                first_input = false;
            }else {
                result.setText(String.format("%s%s",result.getText().toString(), "1"));

            }
            first_action = true;
        }


        if (view.getId() == R.id.two){

            if (first_input){
                result.setText("2");
                first_input = false;
            }else {
                result.setText(String.format("%s%s",result.getText().toString(), "2"));

            }
            first_action = true;
        }


        if (view.getId() == R.id.three){

            if (first_input){
                result.setText("3");
                first_input = false;
            }else {
                result.setText(String.format("%s%s",result.getText().toString(), "3"));

            }
            first_action = true;
        }


        if (view.getId() == R.id.four){

            if (first_input){
                result.setText("4");
                first_input = false;
            }else {
                result.setText(String.format("%s%s",result.getText().toString(), "4"));

            }
            first_action = true;
        }


        if (view.getId() == R.id.five){

            if (first_input){
                result.setText("5");
                first_input = false;
            }else {
                result.setText(String.format("%s%s",result.getText().toString(), "5"));

            }
            first_action = true;
        }


        if (view.getId() == R.id.six){

            if (first_input){
                result.setText("6");
                first_input = false;
            }else {
                result.setText(String.format("%s%s",result.getText().toString(), "6"));

            }
            first_action = true;
        }


        if (view.getId() == R.id.seven){

            if (first_input){
                result.setText("7");
                first_input = false;
            }else {
                result.setText(String.format("%s%s",result.getText().toString(), "7"));

            }
            first_action = true;
        }


        if (view.getId() == R.id.eight){

            if (first_input){
                result.setText("8");
                first_input = false;
            }else {
                result.setText(String.format("%s%s",result.getText().toString(), "8"));

            }
            first_action = true;
        }


        if (view.getId() == R.id.nine){

            if (first_input){
                result.setText("9");
                first_input = false;
            }else {
                result.setText(String.format("%s%s",result.getText().toString(), "9"));

            }
            first_action = true;
        }


        if (view.getId() == R.id.zero){

            if (first_input){
                result.setText("0");
                first_input = false;
            }else {
                result.setText(String.format("%s%s",result.getText().toString(), "0"));

            }
            first_action = true;
        }


        if (view.getId() == R.id.c){

            result.setText("0");
            first_input = true;
        }


        if (view.getId() == R.id.plus){
            sign = "+";
            
            if (first_action){
                if (!val1){
                    value1 = Double.valueOf(result.getText().toString());
                    val1 = true;
                }else {
                    value2 = Double.valueOf(result.getText().toString());

                }
                first_action = false;
            }
            result.setText("+");
            first_input = true;
        }


        if (view.getId() == R.id.dot){
            if (first_input){
                result.setText("0.");
                first_input = false;
            }else {
                result.setText(String.format("%s%s",result.getText().toString(), "."));

            }
        }



        if (view.getId() == R.id.m){


            mStore = String.valueOf(memoryStore);
            result.setText(mStore);


        }

        if (view.getId() == R.id.m_plus){


                    memoryStore = Double.valueOf(memoryStore + Double.valueOf(result.getText().toString()));
                }



        if (view.getId() == R.id.del){
            memoryStore = 0.0;
            result.setText("0");



        }


        if (view.getId() == R.id.division){
            sign = "/";

            if (first_action){
                if (!val1){
                    value1 = Double.valueOf(result.getText().toString());
                    val1 = true;
                }else {
                    value2 = Double.valueOf(result.getText().toString());
                }
                first_action = false;
            }
            result.setText("/");
            first_input = true;
        }


        if (view.getId() == R.id.multiplication){
            sign = "X";

            if (first_action){
                if (!val1){
                    value1 = Double.valueOf(result.getText().toString());
                    val1 = true;
                }else {
                    value2 = Double.valueOf(result.getText().toString());
                }
                first_action = false;
            }
            result.setText("X");
            first_input = true;
        }


        if (view.getId() == R.id.minus){

            sign = "-";

            if (first_action){
                if (!val1){
                    value1 = Double.valueOf(result.getText().toString());
                    val1 = true;
                }else {
                    value2 = Double.valueOf(result.getText().toString());
                }
                first_action = false;
            }
            result.setText("-");
            first_input = true;


        }

        if (view.getId() == R.id.plus){

            sign = "+";

            if (first_action){
                if (!val1){
                    value1 = Double.valueOf(result.getText().toString());
                    val1 = true;
                }else{
                    value2 = Double.valueOf(result.getText().toString());
                }
                first_action = false;
            }
            result.setText("+");
            first_input = true;
        }


        if (view.getId() == R.id.equal){

            if (first_action){
                if (!val1){
                    value1 = Double.valueOf(result.getText().toString());
                    val1 = true;
                }else{
                    value2 = Double.valueOf(result.getText().toString());
                }
                if (sign.equals("+")){
                    double sum = value1 + value2;
                    result.setText(String.valueOf(sum));

                }else if (sign.equals("-")){
                    double submission = value1 - value2;
                    result.setText(String.valueOf(submission));

                }else if (sign.equals("*")){
                    double multiplication = value1 * value2;
                    result.setText(String.valueOf(multiplication));

                }else if (sign.equals("/")){
                   try {
                       double division = value1 / value2;
                       result.setText(String.valueOf(division));
                   }catch (Exception e){
                       result.setText("Error");
                   }


                }else {
                    result.setText(result.getText());
                }
            } else {
                result.setText("Error");
            }
            value1 = 0.0;
            value2 = 0.0;
            val1 = false;
            first_input = true;
            first_action = true;
        }
    }
}
