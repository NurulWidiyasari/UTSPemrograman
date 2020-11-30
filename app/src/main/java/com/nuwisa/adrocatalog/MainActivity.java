package com.nuwisa.adrocatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnSamsung,btnOppo,btnVivo;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnSamsung = findViewById(R.id.btn_buka_Samsung);
        btnOppo = findViewById(R.id.btn_buka_Oppo);
        btnVivo = findViewById(R.id.btn_buka_Vivo);
        btnSamsung.setOnClickListener(view -> bukaGaleri("Samsung"));
        btnOppo.setOnClickListener(view -> bukaGaleri("Oppo"));
        btnVivo.setOnClickListener(view -> bukaGaleri("Vivo"));
    }

    private void bukaGaleri(String jenisHp) {
        Log.d("MAIN","Buka activity Samsung");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHp);
        startActivity(intent);
    }

}