package com.example.admin.recyclerviewlistview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 9/12/2017.
 */

public class CustomListAdapter extends ArrayAdapter<Person> {



    public CustomListAdapter(@NonNull Context context,
                             @LayoutRes int resource,
                             @NonNull List<Person> personList) {
        super(context, resource, personList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        //inflate the view
        if(view == null){
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.custom_listview_item,null);
        }

        //bind the views in the custom item layout
        TextView tvPersonName = view.findViewById(R.id.tvPersonName);
        TextView tvPersonAge = view.findViewById(R.id.tvPersonAge);
        TextView tvPersonGender = view.findViewById(R.id.tvPersonGender);
        TextView tvPersonHeight = view.findViewById(R.id.tvPersonHeight);

        //set data for each view using the personList
        Person person = getItem(position);

        if(person != null){
            tvPersonName.setText(person.getName());
            tvPersonAge.setText(String.valueOf(person.getAge()));
            tvPersonGender.setText(person.getGender());
            tvPersonHeight.setText(String.valueOf(person.getHeight()));
        }

        return view;
    }
}
