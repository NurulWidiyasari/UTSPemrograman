package com.nuwisa.adrocatalog;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.nuwisa.adrocatalog.model.Hp;

public class GaleriActivity extends AppCompatActivity {

    List<Hp> hps;
    int indeksTampil = 0;
    String jenisHp;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txTipe,txSistemOperasi,txDeskripsi,txJudul;
    ImageView ivFotoHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        Intent intent = getIntent();
        jenisHp = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        hps = DataProvider.getHpsByTipe(this,jenisHp);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> hewanPertama());
        btnTerakhir.setOnClickListener(view -> hewanTerakhir());
        btnSebelumnya.setOnClickListener(view -> hewanSebelumnya());
        btnBerikutnya.setOnClickListener(view -> hewanBerikutnya());

        txTipe = findViewById(R.id.txTipe);
        txSistemOperasi = findViewById(R.id.txSistemOperasi);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarHp);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Berbagai Macam seri "+jenisHp);
    }


    private void tampilkanProfil() {
        Hp k = hps.get(indeksTampil);
        Log.d("Samsung","Menampilkan hp "+k.getJenis());
        txTipe.setText(k.getTipe());
        txSistemOperasi.setText(k.getAsal());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoHewan.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void hewanPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void hewanTerakhir() {
        int posAkhir = hps.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void hewanBerikutnya() {
        if (indeksTampil == hps.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void hewanSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}