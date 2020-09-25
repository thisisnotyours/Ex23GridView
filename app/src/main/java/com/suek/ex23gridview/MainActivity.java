package com.suek.ex23gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 1)
    GridView gridView;
    ArrayAdapter adapter;

    ArrayList<String> datas= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1) 대량의 데이터들 만들기
        datas.add("데이터 1");
        datas.add("데이터 2");
        datas.add("데이터 3");
        datas.add("데이터 4");
        datas.add("데이터 5");
        datas.add("데이터 6");
        datas.add("데이터 7");
        datas.add("데이터 8");

        // 2) gridView 찾기
        gridView= findViewById(R.id.gridview);

        // 3) adapter 객체생성
        adapter= new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, datas);

        // 4)
        gridView.setAdapter(adapter);

        // 5)
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
