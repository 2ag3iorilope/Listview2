package com.ikaslea.listview2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button buttonjoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonjoan = findViewById(R.id.button);

        buttonjoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String messageTitle = "Shopping List";


                Intent goListActivity = new Intent(MainActivity.this, ListActivitya.class);


                goListActivity.putExtra("message", messageTitle);


                startActivity(goListActivity);

            }
        });


    }
}