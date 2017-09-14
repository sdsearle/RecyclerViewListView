package com.example.admin.recyclerviewlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goToView(View view) {
        switch (view.getId()){
            case R.id.btnListView:

                Intent intent = new Intent(this,ListViewActivity.class);
                startActivity(intent);

                break;

            case R.id.btnRecyclerView:

                Intent intent1 = new Intent(this, RecyclerViewActivity.class);
                startActivity(intent1);

                break;
        }
    }
}
