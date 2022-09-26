package com.cieep.a02_ciclodevidadelasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HijoActivity extends AppCompatActivity {

    private Button btnCerrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijo);
        Log.e("CICLO VIDA", "Estoy ejecutando onCreate - ACTIVIDAD 2");

        btnCerrar = findViewById(R.id.btnCerrarHijo);
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("CICLO VIDA", "Estoy ejecutando onStart - ACTIVIDAD 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("CICLO VIDA", "Estoy ejecutando onRestart - ACTIVIDAD 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("CICLO VIDA", "Estoy ejecutando onStop - ACTIVIDAD 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("CICLO VIDA", "Estoy ejecutando onDestroy - ACTIVIDAD 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("CICLO VIDA", "Estoy ejecutando onPause - ACTIVIDAD 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("CICLO VIDA", "Estoy ejecutando onResume - ACTIVIDAD 2");
    }
}