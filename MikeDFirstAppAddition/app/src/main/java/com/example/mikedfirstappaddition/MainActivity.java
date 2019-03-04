package com.example.mikedfirstappaddition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double getNum() {
        EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
        return Double.parseDouble(firstNumEditText.getText().toString());
    }

    private double getNum2() {
        EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
        return Double.parseDouble(secondNumEditText.getText().toString());
    }

    private TextView getText() {
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        return resultTextView;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getText().setText(getNum() + getNum2() + "");
            }
        });

        Button subBtn = (Button) findViewById(R.id.subBtn);
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getText().setText(getNum() - getNum2() + "");
            }
        });

        Button multBtn = (Button) findViewById(R.id.multBtn);
        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getText().setText(getNum() * getNum2() + "");
            }
        });

        Button divBtn = (Button) findViewById(R.id.divBtn);
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getText().setText(getNum() / getNum2() + "");
            }
        });

        Button sqrBtn = (Button) findViewById(R.id.sqr);
        sqrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getText().setText(Math.sqrt(getNum()) + "");
            }
        });

        Button powBtn = (Button) findViewById(R.id.pow);
        powBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getText().setText(Math.pow(getNum(), getNum2()) + "");
            }
        });
    }

}
