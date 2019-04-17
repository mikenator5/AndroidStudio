package com.example.quadratic;

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

    private double getX3() {
        EditText secondNumEditText = (EditText) findViewById(R.id.X3);
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

    private double getY3() {
        EditText secondNumEditText = (EditText) findViewById(R.id.Y3);
        return Double.parseDouble(secondNumEditText.getText().toString());
    }

    private TextView getA() {
        TextView resultTextViewM = (TextView) findViewById(R.id.A);

        return resultTextViewM;
    }

    private TextView getB() {
        TextView resultTextViewB = (TextView) findViewById(R.id.B);

        return resultTextViewB;
    }

    private TextView getC() {
        TextView resultTextViewB = (TextView) findViewById(R.id.C);

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


                double aStep1 = (getX1() * (getY3() - getY2())) + (getX2() * (getY1() - getY3())) + (getX3() * (getY2() - getY1()));
                double aStep2 = (getX1() - getX2()) * (getX1() - getX3()) * (getX2() - getX3());
                double a = aStep1 / aStep2;

                double b = ((getY2() - getY1()) / (getX2() - getX1())) - (a * (getX1() + getX2()));

                double c = (getY1() - (a * (Math.pow(getX1(), 2))) - (b * getX1()));

                getA().setText(a + "");
                getB().setText(b + "");
                getC().setText(c + "");

            }
        });
    }

}
