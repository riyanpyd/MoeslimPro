package com.riyanpriyadi.moeslimpro.DoaHarian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.riyanpriyadi.moeslimpro.R;

public class DoaActivity extends AppCompatActivity {
    private Button btndoaBercermin, btnDoaMimpiBuruk, btnDoaBepergian,
            btnDoaBacaAlquran, btnDoaOrangtua, btnDoaCitaCita, btnDoaDuniaAkhirat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);

        btndoaBercermin = (Button)findViewById(R.id.doa_bercermin);
        btnDoaMimpiBuruk = (Button)findViewById(R.id.doa_mimpi_buruk);
        btnDoaBepergian = (Button)findViewById(R.id.doa_bepergian);
        btnDoaBacaAlquran = (Button)findViewById(R.id.doa_baca_alquran);
        btnDoaOrangtua = (Button)findViewById(R.id.doa_orangtua);
        btnDoaCitaCita = (Button)findViewById(R.id.doa_citacita);
        btnDoaDuniaAkhirat = (Button)findViewById(R.id.doa_dunia_akhirat);


        btndoaBercermin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaActivity.this, DoaBercermin.class);
                startActivity(intent);
            }
        });

        btnDoaMimpiBuruk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaActivity.this, DoaBermimpiBuruk.class);
                startActivity(intent);
            }
        });
        btnDoaBepergian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaActivity.this, DoaBepergian.class);
                startActivity(intent);
            }
        });
        btnDoaBacaAlquran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaActivity.this, DoaSebelumBacaAlquran.class);
                startActivity(intent);
            }
        });
        btnDoaOrangtua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaActivity.this, DoaUntukOrangtua.class);
                startActivity(intent);
            }
        });
        btnDoaCitaCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaActivity.this, DoaCitaCita.class);
                startActivity(intent);
            }
        });
        btnDoaDuniaAkhirat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaActivity.this, DoaDuniaAkhirat.class);
                startActivity(intent);
            }
        });
    }
}

