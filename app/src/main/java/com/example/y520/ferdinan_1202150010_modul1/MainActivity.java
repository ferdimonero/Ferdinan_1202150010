package com.example.y520.ferdinan_1202150010_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText jumlah;
    public void onEatbus(View view) {
        Intent intent = new Intent(getApplicationContext(), Result.class);
        Bundle b = new Bundle();
        jumlah = (EditText) findViewById(R.id.txt_jumlah);
        String jml = jumlah.getText().toString();
        int harga=Integer.parseInt(jml)*50000;

        b.putString("resto","EATBUS");
        b.putString("jumlah",jumlah.getText().toString());
        b.putString("harga",String.valueOf(harga));
        intent.putExtras(b);
        Toast.makeText(this, "Uang Tidak Cukup, Makan Malam Di Pilihan Lain Saja", Toast.LENGTH_LONG).show();


        startActivity(intent);
    }

    public void onAbnormal(View view) {
        Intent intent = new Intent(getApplicationContext(), Result.class);
        Bundle b = new Bundle();
        jumlah = (EditText) findViewById(R.id.txt_jumlah);
        String jml = jumlah.getText().toString();
        int harga=Integer.parseInt(jml)*30000;

        b.putString("resto","ABNORMAL");
        b.putString("jumlah",jumlah.getText().toString());
        b.putString("harga",String.valueOf(harga));
        intent.putExtras(b);

        Toast.makeText(this, "Makan Malam Disini Saja", Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}
