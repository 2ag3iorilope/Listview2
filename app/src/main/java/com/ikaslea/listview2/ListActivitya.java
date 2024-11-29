package com.ikaslea.listview2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListActivitya extends AppCompatActivity {

    TextView txt_Title;
    ListView lst_Shopping;
    List<String> shoppingList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        txt_Title = findViewById(R.id.textView);
        lst_Shopping = findViewById(R.id.lst_shopping);
        Bundle extras = getIntent().getExtras();
        String title = extras.getString("message");
        txt_Title.setText(title);

        shoppingList = new ArrayList<String>();
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");
        shoppingList.add("Butter");
        shoppingList.add("Cheese");
        shoppingList.add("Yogurt");

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, shoppingList);
        lst_Shopping.setAdapter(adapter);
    }
}