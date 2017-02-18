package com.triplefighter.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] listNim, listNama;
    String[] kelas = new String[]{"D3IF-39-01","D3IF-39-01","D3IF-39-02","D3IF-39-03","D3IF-39-04","D3IF-39-05"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listKelas);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,kelas);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent in = new Intent(getApplicationContext(),MahasiswaActivity.class);
                switch (i){
                    case 0:
                        listNim = new String[]{"6706150001","6706150001","6706150001","6706150001"};
                        listNama = new String[]{"aku","kamu","dia","anda"};
                        in.putExtra("nim",listNim);
                        in.putExtra("nama",listNama);
                        startActivity(in);
                        break;
                    case 1:
                        listNim = new String[]{"6706150001","6706150001","6706150001","6706150001"};
                        listNama = new String[]{"aku","kamu","dia","anda"};
                        in.putExtra("nim",listNim);
                        in.putExtra("nama",listNama);
                        startActivity(in);
                        break;
                    case 2:
                        listNim = new String[]{"6706150001","6706150001","6706150001","6706150001"};
                        listNama = new String[]{"aku","kamu","dia","anda"};
                        in.putExtra("nim",listNim);
                        in.putExtra("nama",listNama);
                        startActivity(in);
                        break;
                    case 3:
                        listNim = new String[]{"6706150001","6706150001","6706150001","6706150001"};
                        listNama = new String[]{"aku","kamu","dia","anda"};
                        in.putExtra("nim",listNim);
                        in.putExtra("nama",listNama);
                        startActivity(in);
                        break;
                    case 4:
                        listNim = new String[]{"6706150001","6706150001","6706150001","6706150001"};
                        listNama = new String[]{"aku","kamu","dia","anda"};
                        in.putExtra("nim",listNim);
                        in.putExtra("nama",listNama);
                        startActivity(in);
                        break;
                }
            }
        });

    }
}
