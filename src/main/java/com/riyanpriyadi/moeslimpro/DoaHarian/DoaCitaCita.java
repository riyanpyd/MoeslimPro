package com.riyanpriyadi.moeslimpro.DoaHarian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.riyanpriyadi.moeslimpro.R;

public class DoaCitaCita extends AppCompatActivity {
    private Button btnPrev, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_cita_cita);

        btnPrev = (Button)findViewById(R.id.btn_prev);
        btnNext = (Button)findViewById(R.id.btn_next);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaCitaCita.this, DoaUntukOrangtua.class);
                startActivity(intent);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaCitaCita.this, DoaDuniaAkhirat.class);
                startActivity(intent);
            }
        });
    }
}

