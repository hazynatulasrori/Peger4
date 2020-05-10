package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class out_put extends AppCompatActivity {
    String nama, npm, jk, jabatan, gaji;
    TextView outnama, outNpm, outJK, outJabatan, outGaji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_put);
        getSupportActionBar().setTitle("OutputTugas 4");

        outnama     = (TextView)findViewById(R.id.outNama);
        outNpm      = (TextView)findViewById(R.id.outNpm);
        outJK       = (TextView)findViewById(R.id.outJK);
        outJabatan  = (TextView)findViewById(R.id.outJabatan);
        outGaji     = (TextView)findViewById(R.id.outGaji);

        Intent i = getIntent();
        outnama.setText(i.getExtras().getString("nama"));
        outNpm.setText(i.getExtras().getString("npm"));
        outJK.setText(i.getExtras().getString("jk"));
        outJabatan.setText(i.getExtras().getString("jabatan"));
        outGaji.setText(i.getExtras().getString("gaji"));
    }
}
