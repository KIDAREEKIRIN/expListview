package com.personal.explistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView listView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listHashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listView = findViewById(R.id.exp_list_view);
        
        intializeData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader,listHashMap);
        listView.setAdapter(listAdapter);

        //That's All just Run your App.
    }

    private void intializeData() {
        //First Add Header List
        listDataHeader = new ArrayList<>();
        listHashMap = new HashMap<>();

        listDataHeader.add("Mobile Development");
        listDataHeader.add("Web Development");
        listDataHeader.add("DeskTop Development");
        listDataHeader.add("Databases");

        // After that add childs list.

        List<String> mobileDev = new ArrayList<>();
        mobileDev.add("Java");
        mobileDev.add("Kotlin");
        mobileDev.add("Xamarin");
        mobileDev.add("Flutter");
        mobileDev.add("Ionic");

        List<String> webDev = new ArrayList<>();
        webDev.add("HTML");
        webDev.add("CSS");
        webDev.add("Javascript");
        webDev.add("JQuery");

        List<String> deskDev = new ArrayList<>();
        deskDev.add("C Sharp");
        deskDev.add("VB.Net");
        deskDev.add("Java");

        List<String> databaseDev = new ArrayList<>();
        databaseDev.add("Firebase");
        databaseDev.add("Mysql");
        databaseDev.add("MariaDB");
        databaseDev.add("SQLite");

        listHashMap.put(listDataHeader.get(0),mobileDev);
        listHashMap.put(listDataHeader.get(1),webDev);
        listHashMap.put(listDataHeader.get(2),deskDev);
        listHashMap.put(listDataHeader.get(3),databaseDev);


    }
}