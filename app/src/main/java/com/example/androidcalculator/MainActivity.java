package com.example.androidcalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView expressionTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);

        expressionTxt = findViewById(R.id.expressionTxt);
    }

    public void onClickC(View view) {
        expressionTxt.setText("");
    }

    public void onClickBack(View view) {
    }

    @SuppressLint("SetTextI18n")
    public void onClick0(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void onClick1(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void onClick2(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void onClick3(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void onClick4(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void onClick5(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void onClick6(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void onClick7(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void onClick8(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void onClick9(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void onClickMinus(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "-");
    }

    @SuppressLint("SetTextI18n")
    public void onClickPlus(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "+");
    }

    public void onClickEquals(View view) {
    }

    @SuppressLint("SetTextI18n")
    public void onClickMultiply(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "*");
    }

    @SuppressLint("SetTextI18n")
    public void onClickDivide(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "/");
    }

    @SuppressLint("SetTextI18n")
    public void onClickDot(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + ".");
    }
}