package com.example.profilsekolahsmkal_irsyadtegal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        LinearLayout RPL = findViewById(R.id.rpl);
        LinearLayout TKJ = findViewById(R.id.tkj);
        LinearLayout AKL = findViewById(R.id.akl);
        ConstraintLayout About = findViewById(R.id.About);
        LinearLayout Lokasi = findViewById(R.id.lokasi);
        LinearLayout Sarpras = findViewById(R.id.sarpras);
        LinearLayout Kejuaraan = findViewById(R.id.kejuaraan);
        LinearLayout Dev = findViewById(R.id.developer);

        RPL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, rpl.class));
                finish();
            }
        });

        TKJ.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, tkj.class));
                finish();
            }
        });

        AKL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, akl.class));
                finish();
            }
        });

        About.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, aboutpage.class));
                finish();
            }
        });

        Lokasi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Lokasi.class));
                finish();
            }
        });

        Sarpras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Sarpras.class));
                finish();
            }
        });

        Kejuaraan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, kejuaraan.class));
                finish();
            }
        });

        Dev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Developer.class));
                finish();
            }
        });
    }
}