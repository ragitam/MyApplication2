package com.triplefighter.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapater extends BaseAdapter {
    Context context;
    String[] nim;
    String[] nama;
    LayoutInflater layoutInflater;

    public ListViewAdapater(Context context, String[] nim, String[] nama) {
        this.context = context;
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public int getCount() {
        return nim.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView nimText, namaText;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.list_mahasiswa,viewGroup,false);

        nimText = (TextView)itemView.findViewById(R.id.nim);
        namaText = (TextView)itemView.findViewById(R.id.nama);

        nimText.setText(nim[i]);
        namaText.setText(nama[i]);

        return itemView;
    }
}
