package com.riyanpriyadi.moeslimpro.DoaHarian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.riyanpriyadi.moeslimpro.R;

public class DoaSebelumBacaAlquran extends AppCompatActivity {
    private Button btnPrev, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_sebelum_baca_alquran);

        btnPrev = (Button)findViewById(R.id.btn_prev);
        btnNext = (Button)findViewById(R.id.btn_next);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaSebelumBacaAlquran.this, DoaBepergian.class);
                startActivity(intent);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaSebelumBacaAlquran.this, DoaUntukOrangtua.class);
                startActivity(intent);
            }
        });
    }
}