package com.triplefighter.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MahasiswaActivity extends AppCompatActivity {

    String[] nimList, namaList;
    ListViewAdapater adapater;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa);

        listView = (ListView)findViewById(R.id.listMhs);

        Intent in = getIntent();
        nimList = in.getStringArrayExtra("nim");
        namaList = in.getStringArrayExtra("nama");

        adapater = new ListViewAdapater(MahasiswaActivity.this,nimList,namaList);
        listView.setAdapter(adapater);

    }
}
