package com.example.t00528560.improvasite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
;import java.lang.reflect.Array;

public class eyeTestHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_test_home);
        String[] tests = {"VISUAL ACUITY", "LIGHT SENSITIVITY", "NEAR VISION", "COLOR VISION", "AMD"};

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tests);

        ListView listView = (ListView) findViewById(R.id.listTest);
        listView.setAdapter(itemsAdapter);

    }
}
  //  public void onItemClick(AdapterView<?> l, View v, int position, long id) {
        //Log.i("HelloListView", "You clicked Item: " + id + " at position:" + position);
        // Then you start a new Activity via Intent
        //Intent intent = new Intent();
       // intent.setClass(this, );
       // intent.putExtra("position", position);
        // Or / And
       // intent.putExtra("id", id);
       // startActivity(intent);
//}
