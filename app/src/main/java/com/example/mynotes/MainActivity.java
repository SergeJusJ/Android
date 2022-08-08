package com.example.mynotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //data
        List<String> noteList = new ArrayList<>();
        noteList.add("Tekstas 1");
        noteList.add("Tekstas 2");
        noteList.add("Tekstas 3");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                noteList
        );

        //ListView
        ListView listView = findViewById(R.id.noteListView);
        listView.setAdapter(arrayAdapter);



    }
}