package com.example.admin.recyclerviewlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    ListView lvSimple, lvCustom, lvCustomVH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvSimple = (ListView) findViewById(R.id.lvSimple);
        lvCustom = (ListView) findViewById(R.id.lvCustom);
        lvCustomVH = (ListView) findViewById(R.id.lvCustomVH);

        ArrayList<String> personListSimple = new ArrayList<>();
        personListSimple.add("John Doe");
        personListSimple.add("John Doe1");
        personListSimple.add("John Doe2");
        personListSimple.add("John Doe3");
        personListSimple.add("John Doe4");
        personListSimple.add("John Doe5");
        personListSimple.add("John Doe6");

        //create an adapter for the simple list using the default layout
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,personListSimple);
        //set the adapter to the simple list view
        lvSimple.setAdapter(arrayAdapter);

        //create a list of person objs
        List<Person> personListCustom = new ArrayList<>();
        personListCustom.add(new Person("Bill Clinton", 65, "Male", 167));
        personListCustom.add(new Person("Tom Cruise", 50, "Male", 142));
        personListCustom.add(new Person("Jennifer Aniston", 30, "Female", 150));
        personListCustom.add(new Person("Billy Joe", 65, "Male", 160));

        //create Custom Adapter
        CustomListAdapter customListAdapter = new CustomListAdapter(this,
                R.layout.custom_listview_item, personListCustom);

        lvCustom.setAdapter(customListAdapter);

        CustomVHListAdapter customVHListAdapter = new CustomVHListAdapter(this,
                R.layout.custom_listview_item,personListCustom);

        lvCustomVH.setAdapter(customVHListAdapter);

        

    }
}
