package com.example.applaunchermiked;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Launches Second Activity
        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.mikedfirstappaddition");
                if (startIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(startIntent);
                }
            }
        });

        // Launch an activity outside our app
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.westada.tech/a4/miked";
                Uri webAddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webAddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoGoogle);
                }
            }
        });

        Button slopeCalc = (Button) findViewById(R.id.slopeCalc);
        slopeCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.slopecalc");
                if (startIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(startIntent);
                }

            }
        });

        Button peach = (Button) findViewById(R.id.Peach);
        peach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.listapp");
                if (startIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(startIntent);
                }

            }
        });

        Button creative = (Button) findViewById(R.id.creative);
        creative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.listappcreative");
                if (startIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(startIntent);
                }

            }
        });

        Button quadratic = (Button) findViewById(R.id.quadratic);
        quadratic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.quadratic");
                if (startIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(startIntent);
                }

            }
        });
    }
}
