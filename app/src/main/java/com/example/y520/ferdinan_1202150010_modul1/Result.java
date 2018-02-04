package com.example.y520.ferdinan_1202150010_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle b = getIntent().getExtras();
        //membuat obyek dari widget textview
        TextView resto = (TextView) findViewById(R.id.txt_resto);
        TextView porsi = (TextView) findViewById(R.id.txt_jumlah2);
        TextView harga = (TextView) findViewById(R.id.txt_harga2);
        //menset nilai dari widget textview
        resto.setText(b.getCharSequence("resto"));
        porsi.setText(b.getCharSequence("jumlah"));
        harga.setText(b.getCharSequence("harga"));
    }
}
