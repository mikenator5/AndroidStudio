package com.example.slopecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double getX1() {
        EditText firstNumEditText = (EditText) findViewById(R.id.X1);
        return Double.parseDouble(firstNumEditText.getText().toString());
    }

    private double getX2() {
        EditText secondNumEditText = (EditText) findViewById(R.id.X2);
        return Double.parseDouble(secondNumEditText.getText().toString());
    }

    private double getY1() {
        EditText firstNumEditText = (EditText) findViewById(R.id.Y1);
        return Double.parseDouble(firstNumEditText.getText().toString());
    }

    private double getY2() {
        EditText secondNumEditText = (EditText) findViewById(R.id.Y2);
        return Double.parseDouble(secondNumEditText.getText().toString());
    }

    private TextView getM() {
        TextView resultTextViewM = (TextView) findViewById(R.id.M);

        return resultTextViewM;
    }

    private TextView getB() {
        TextView resultTextViewB = (TextView) findViewById(R.id.B);

        return resultTextViewB;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calc = (Button) findViewById(R.id.calculate);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double slope = (getY2() - getY1()) / (getX2() - getX1());

                double result = getY1() - (slope * getX1());

                getM().setText(slope + "");
                getB().setText(result + "");

            }
        });
    }

}
