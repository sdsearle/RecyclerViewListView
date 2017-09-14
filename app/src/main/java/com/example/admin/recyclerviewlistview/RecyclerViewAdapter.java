package com.example.admin.recyclerviewlistview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    /**
     * Created by admin on 9/13/2017.
     */

    List<Person> personList = new ArrayList<>();
    private String TAG = "TAG";

    public RecyclerViewAdapter(List<Person> personList) {
        this.personList = personList;
    }


    //ViewHolder Pattern allows one to reuse the memory block
    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView tvPersonName;
        private final TextView tvPersonAge;
        private final TextView tvPersonGender;
        private final TextView tvPersonHeight;

        public ViewHolder(View itemView) {

            super(itemView);
            //bind the views in the custom item layout
            tvPersonName = itemView.findViewById(R.id.tvPersonName);
            tvPersonAge = itemView.findViewById(R.id.tvPersonAge);
            tvPersonGender = itemView.findViewById(R.id.tvPersonGender);
            tvPersonHeight = itemView.findViewById(R.id.tvPersonHeight);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_list_item, parent, false);
        Log.d(TAG, "onCreateViewHolder: ");
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Person person = personList.get(position);

        holder.tvPersonName.setText(person.getName());
        holder.tvPersonAge.setText(String.valueOf(person.getAge()));
        holder.tvPersonHeight.setText(String.valueOf(person.getHeight()));
        holder.tvPersonGender.setText(person.getGender());

        //holder.itemView.setAnimation(new Animation() {});

        Log.d(TAG, "onBindViewHolder: ");
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
}
