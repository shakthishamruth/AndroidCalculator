package com.example.androidcalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {

    private TextView expressionTxt;

    private Boolean operatorUse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);
        operatorUse = false;

        expressionTxt = findViewById(R.id.expressionTxt);
    }

    public void onClickC(View view) {
        expressionTxt.setText("");
        operatorUse = false;
    }

    public void onClickBack(View view) {
        Back();
    }

    public void Back() {
        StringBuilder sb = new StringBuilder(expressionTxt.getText().toString());
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            expressionTxt.setText(sb.toString());
        }
    }

    @SuppressLint("SetTextI18n")
    public void onClick0(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "0");
        operatorUse = true;
    }

    @SuppressLint("SetTextI18n")
    public void onClick1(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "1");
        operatorUse = true;
    }

    @SuppressLint("SetTextI18n")
    public void onClick2(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "2");
        operatorUse = true;
    }

    @SuppressLint("SetTextI18n")
    public void onClick3(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "3");
        operatorUse = true;
    }

    @SuppressLint("SetTextI18n")
    public void onClick4(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "4");
        operatorUse = true;
    }

    @SuppressLint("SetTextI18n")
    public void onClick5(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "5");
        operatorUse = true;
    }

    @SuppressLint("SetTextI18n")
    public void onClick6(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "6");
        operatorUse = true;
    }

    @SuppressLint("SetTextI18n")
    public void onClick7(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "7");
        operatorUse = true;
    }

    @SuppressLint("SetTextI18n")
    public void onClick8(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "8");
        operatorUse = true;
    }

    @SuppressLint("SetTextI18n")
    public void onClick9(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "9");
        operatorUse = true;
    }

    @SuppressLint("SetTextI18n")
    public void onClickMinus(View view) {
        StringBuilder sb = new StringBuilder(expressionTxt.getText().toString());
        if (operatorUse && sb.length() > 0) {
            expressionTxt.setText(expressionTxt.getText().toString() + "-");
        } else {
            if (sb.length() > 0) {
                Back();
                expressionTxt.setText(expressionTxt.getText().toString() + "-");
            }
        }
        operatorUse = false;
    }

    @SuppressLint("SetTextI18n")
    public void onClickPlus(View view) {
        if (operatorUse) {
            expressionTxt.setText(expressionTxt.getText().toString() + "+");
        } else {
            StringBuilder sb = new StringBuilder(expressionTxt.getText().toString());
            if (sb.length() > 0) {
                Back();
                expressionTxt.setText(expressionTxt.getText().toString() + "+");
            }
        }
        operatorUse = false;
    }

    @SuppressLint("SetTextI18n")
    public void onClickEquals(View view) {
        if (operatorUse) {
            try {
                double sol = EvaluateString.evaluate(expressionTxt.getText().toString());
                expressionTxt.setText(Double.toString(round(sol, 2)));
            } catch (Exception e) {
                Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @SuppressLint("SetTextI18n")
    public void onClickMultiply(View view) {
        if (operatorUse) {
            expressionTxt.setText(expressionTxt.getText().toString() + "×");
        } else {
            Back();
            expressionTxt.setText(expressionTxt.getText().toString() + "×");
        }
        operatorUse = false;
    }

    @SuppressLint("SetTextI18n")
    public void onClickDivide(View view) {
        if (operatorUse) {
            expressionTxt.setText(expressionTxt.getText().toString() + "÷");
        } else {
            Back();
            expressionTxt.setText(expressionTxt.getText().toString() + "÷");
        }
        operatorUse = false;
    }

    @SuppressLint("SetTextI18n")
    public void onClickDot(View view) {
        // expressionTxt.setText(expressionTxt.getText().toString() + ".");
    }

    @SuppressLint("SetTextI18n")
    public void onClickOpenB(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + "(");
    }

    @SuppressLint("SetTextI18n")
    public void onClickClosedB(View view) {
        expressionTxt.setText(expressionTxt.getText().toString() + ")");
    }
}