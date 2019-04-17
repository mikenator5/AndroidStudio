package com.example.mylistgames;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView games;
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        games = (ListView) findViewById(R.id.);
        items = res.getStringArray(R.array.items);

        games.setAdapter(new ArrayAdapter<String>(this, R.layout.my_listview_detail, items));
    }
}
