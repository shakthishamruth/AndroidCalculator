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

    private int bracketCount = 0;

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
        bracketCount = 0;
    }

    public void onClickBack(View view) {
        Back();
    }

    public void Back() {
        try {
            StringBuilder sb = new StringBuilder(expressionTxt.getText().toString());
            if (sb.length() > 0) {
                if (sb.charAt(sb.length() - 1) == '(') {
                    bracketCount--;
                    operatorUse = sb.charAt(sb.length() - 2) >= '0' && sb.charAt(sb.length() - 2) <= '9';
                } else if (sb.charAt(sb.length() - 1) == ')') {
                    bracketCount++;
                } else if (sb.charAt(sb.length() - 1) == '+' || sb.charAt(sb.length() - 1) == '-' || sb.charAt(sb.length() - 1) == '×' || sb.charAt(sb.length() - 1) == '÷') {
                    operatorUse = true;
                } else if (sb.charAt(sb.length() - 1) >= '0' && sb.charAt(sb.length() - 1) <= '9') {
                    if (sb.charAt(sb.length() - 2) >= '0' && sb.charAt(sb.length() - 2) <= '9') {
                        operatorUse = true;
                    } else if (sb.charAt(sb.length() - 2) == '(' || sb.charAt(sb.length() - 2) == ')') {
                        operatorUse = false;
                    } else if (sb.charAt(sb.length() - 2) == '+' || sb.charAt(sb.length() - 2) == '-' || sb.charAt(sb.length() - 2) == '×' || sb.charAt(sb.length() - 2) == '÷') {
                        operatorUse = false;
                    }
                }
                sb.deleteCharAt(sb.length() - 1);
                expressionTxt.setText(sb.toString());
            }
        } catch (Exception e) {
            expressionTxt.setText("");
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
    public void addOperator(String o) {
        // expressionTxt.setText(expressionTxt.getText().toString() + o);
        StringBuilder sb = new StringBuilder(expressionTxt.getText().toString());
        if (sb.length() > 0) {
            int len = sb.length() - 1;
            if (sb.charAt(len) == ')') {
                expressionTxt.setText(expressionTxt.getText().toString() + o);
            } else if (sb.charAt(len) >= '0' && sb.charAt(len) <= '9') {
                expressionTxt.setText(expressionTxt.getText().toString() + o);
            } else if (sb.charAt(len) == '.') {
                expressionTxt.setText(expressionTxt.getText().toString() + "0" + o);
            } else if (sb.charAt(len) == '-') {
                if (sb.charAt(len - 1) == '×' || sb.charAt(len - 1) == '÷') {
                    Back();
                }
                Back();
                expressionTxt.setText(expressionTxt.getText().toString() + o);
            } else {
                if (sb.charAt(len) != '(') {
                    Back();
                    expressionTxt.setText(expressionTxt.getText().toString() + o);
                }
            }
        }
        operatorUse = false;
    }

    @SuppressLint("SetTextI18n")
    public void onClickMinus(View view) {
        String o = "-";
        StringBuilder sb = new StringBuilder(expressionTxt.getText().toString());
        if (sb.length() > 0) {
            int len = sb.length() - 1;
            if (sb.charAt(len) == ')') {
                expressionTxt.setText(expressionTxt.getText().toString() + o);
            } else if (sb.charAt(len) >= '0' && sb.charAt(len) <= '9') {
                expressionTxt.setText(expressionTxt.getText().toString() + o);
            } else if (sb.charAt(len) == '.') {
                expressionTxt.setText(expressionTxt.getText().toString() + "0" + o);
            } else if (sb.charAt(len) == '×' || sb.charAt(len) == '÷') {
                expressionTxt.setText(expressionTxt.getText().toString() + o);
            } else {
                if (sb.charAt(len) != '(' && sb.charAt(len) != '-' || sb.charAt(len) != '+') {
                    Back();
                    expressionTxt.setText(expressionTxt.getText().toString() + o);
                }
            }
        }
        operatorUse = false;
    }

    @SuppressLint("SetTextI18n")
    public void onClickPlus(View view) {
        addOperator("+");
    }

    @SuppressLint("SetTextI18n")
    public void onClickEquals(View view) {
        StringBuilder sb = new StringBuilder(expressionTxt.getText().toString());
        if (sb.length() > 0 && operatorUse && bracketCount == 0) {
            try {
                double sol = EvaluateString.evaluate(expressionTxt.getText().toString());
                expressionTxt.setText(Double.toString(round(sol, 4)));
            } catch (Exception e) {
                Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        } else {
            if (bracketCount != 0) {
                Toast.makeText(this, "Complete All Brackets", Toast.LENGTH_SHORT).show();
            } else if (sb.length() == 0) {
                Toast.makeText(this, "Nothing to Evaluate", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Not Allowed", Toast.LENGTH_SHORT).show();
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
        addOperator("×");
    }

    @SuppressLint("SetTextI18n")
    public void onClickDivide(View view) {
        addOperator("÷");
    }

    @SuppressLint("SetTextI18n")
    public void onClickDot(View view) {
        StringBuilder sb = new StringBuilder(expressionTxt.getText().toString());
        if (operatorUse && sb.length() > 0) {
            char[] tokens = expressionTxt.getText().toString().toCharArray();
            int count = 0;
            boolean isThere = false;
            for (int i = sb.length() - 1; i >= 0; i--) {
                if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '×' || tokens[i] == '÷' || tokens[i] == '(' || tokens[i] == ')') {
                    count = i;
                    break;
                }
            }
            for (int i = sb.length() - 1; i >= count; i--) {
                if (tokens[i] == '.') {
                    isThere = true;
                    break;
                }
            }
            if (!isThere) {
                expressionTxt.setText(expressionTxt.getText().toString() + ".");
            }
        }
    }

    @SuppressLint("SetTextI18n")
    public void onClickOpenB(View view) {
        StringBuilder sb = new StringBuilder(expressionTxt.getText().toString());
        int len = sb.length() - 1;
        if (sb.length() > 0) {
            if ((sb.charAt(len) >= '0' && sb.charAt(len) <= '9') || sb.charAt(len) == ')') {
                expressionTxt.setText(expressionTxt.getText().toString() + "×(");
            } else {
                expressionTxt.setText(expressionTxt.getText().toString() + "(");
            }
            bracketCount++;
        } else if (sb.length() == 0) {
            expressionTxt.setText(expressionTxt.getText().toString() + "(");
            bracketCount++;
        }
    }

    @SuppressLint("SetTextI18n")
    public void onClickClosedB(View view) {
        StringBuilder sb = new StringBuilder(expressionTxt.getText().toString());
        int len = sb.length() - 1;
        if ((bracketCount > 0 && sb.charAt(len) >= '0' && sb.charAt(len) <= '9') || (bracketCount > 0 && sb.charAt(len) == ')')) {
            expressionTxt.setText(expressionTxt.getText().toString() + ")");
            bracketCount--;
        }
    }
}