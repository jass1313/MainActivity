package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String TAG = "MainActivity";
//    TextView textView;

    ListView listView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_listview);
        Log.i(TAG,"onCreate");

//        textView = findViewById(R.id.textView)

        listView = (ListView)findViewById(R.id.listView);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1);
        adapter.add("Amazon");
        adapter.add("jass");
        adapter.add("jasbeer");
        adapter.add("apple");
        adapter.add("facebook");
        adapter.add("youtube");

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        String item = adapter.getItem(i);
        Toast.makeText(this,"you click the button" + item,Toast.LENGTH_LONG).show();


        //Navigate from A1 to A2
        Intent intent = new Intent(MainActivity.this,Activity2.class);
        startActivity(intent);
    }


//    public void clickHandler(View view){
//        Date date = new Date();
//
//        textView.setText("Today is: "+date.toString());
//
//        Toast.makeText(this,"you click the button",Toast.LENGTH_LONG).show();
//    }
}
