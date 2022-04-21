package com.geektech.calculator_isakova_kyial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer firstVar, secondVar;
    private boolean isOperationClick;
    String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }


    public void onClickNumber(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                setNumber("1");
                break;
            case R.id.btn_two:
                setNumber("2");
                break;
            case R.id.btn_three:
                setNumber("3");
                break;
            case R.id.btn_four:
                setNumber("4");
                break;
            case R.id.btn_five:
                setNumber("5");
                break;
            case R.id.btn_six:
                setNumber("6");
                break;
            case R.id.btn_seven:
                setNumber("7");
                break;
            case R.id.btn_eight:
                setNumber("8");
                break;
            case R.id.btn_nine:
                setNumber("9");
                break;
            case R.id.btn_clear:
                textView.setText("0");
                isOperationClick = false;
                break;

        }

    }

    /*public void onClickOperation(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                firstVar = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                break;
            case R.id.btn_equal:
                secondVar = Integer.parseInt(textView.getText().toString());
                Integer result = firstVar + secondVar;
                textView.setText(result.toString());
                isOperationClick = true;
                break;
            case R.id.btn_minus:
                secondVar = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                break;
            case R.id.btn_multiplication:
                isOperationClick = true;
                break;
            case R.id.btn_division:
                isOperationClick = true;
                break;
        }*/
    public void onClickOperation(View view) {
        isOperationClick = true;
        firstVar = Integer.parseInt(textView.getText().toString());
        switch (view.getId()) {
            case R.id.btn_minus:
                operator = "-";
                break;
            case R.id.btn_plus:
                operator = "+";
                break;
            case R.id.btn_division:
                operator = "/";
                break;
            case R.id.btn_multiplication:
                operator = "*";
                break;
    }
    }

    public void onclickEqual(View view) {
        secondVar = Integer.parseInt(textView.getText().toString());
        Integer result = 0;
        switch (operator) {
            case "-":
                result = firstVar - secondVar;
                break;
            case "+":
                result = firstVar + secondVar;
                break;
            case "*":
                result = firstVar * secondVar;
                break;
            case "/":
                result = firstVar / secondVar;
                break;
        }
        textView.setText(result + "");
    }


    private void setNumber(String number) {
        if (textView.getText().toString().equals("0")) {
            textView.setText(number);
        } else if (isOperationClick) {
            textView.setText(number);
        } else {
            textView.append(number);
        }
        isOperationClick = false;
    }



    }
