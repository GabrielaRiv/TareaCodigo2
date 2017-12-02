package com.example.gabriela.tareacodigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button inicio, altos, config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicio = (Button) findViewById(R.id.inicio);
        altos = (Button) findViewById(R.id.altos);
        config = (Button) findViewById(R.id.config);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, Inicio.class);
                startActivity(intent1);
            }
        });

        altos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, PuntajesAltos.class);
                startActivity(intent2);
            }
        });

        config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, Configuracion.class);
                startActivity(intent2);
            }
        });
    }

}