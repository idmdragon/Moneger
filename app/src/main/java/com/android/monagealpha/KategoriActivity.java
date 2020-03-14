package com.android.monagealpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KategoriActivity extends AppCompatActivity {

    Button btnMakanan;
    Kategori kategori;
    InputActivity inputActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);
        btnMakanan = findViewById(R.id.btnMakanan);
        kategori = new Kategori();
        setMakanan();
    }

    public void setMakanan(){
        btnMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kategori.setKategori("Makanan");
                Intent intent = new Intent(KategoriActivity.this,InputActivity.class);
                startActivity(intent);
            }
        });
    }
}
