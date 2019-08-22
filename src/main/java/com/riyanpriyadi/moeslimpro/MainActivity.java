package com.riyanpriyadi.moeslimpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.riyanpriyadi.moeslimpro.DoaHarian.DoaActivity;
import com.riyanpriyadi.moeslimpro.JadwalSholat.JadwalSholatActivity;
import com.riyanpriyadi.moeslimpro.ProdukHalal.ProdukHalalActivity;

public class MainActivity extends AppCompatActivity {
    private Button btn_jadwalSholat, btn_produkHalal, btn_doaHarian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_jadwalSholat = (Button)findViewById(R.id.btn_jadwalSholat);
        btn_produkHalal = (Button)findViewById(R.id.btn_produkHalal);
        btn_doaHarian = (Button)findViewById(R.id.btn_doaHarian);

        btn_jadwalSholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JadwalSholatActivity.class);
                startActivity(intent);
            }
        });

        btn_produkHalal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProdukHalalActivity.class);
                startActivity(intent);
            }
        });

        btn_doaHarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DoaActivity.class);
                startActivity(intent);
            }
        });
    }
}
