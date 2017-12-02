package com.example.gabriela.tareacodigo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Configuracion extends AppCompatActivity {
    private RadioButton rdbFacil, rdbMedio, rdbDificil;
    private EditText nick;
    private Button btnseleccionar, btnnick;
    TextView txtnick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        rdbFacil = (RadioButton) findViewById(R.id.rdbFacil);
        rdbMedio = (RadioButton) findViewById(R.id.rdbMedio);
        rdbDificil = (RadioButton) findViewById(R.id.rdbDificil);
        nick = (EditText) findViewById(R.id.nick);
        txtnick = (TextView) findViewById(R.id.txtnick);
        btnnick = (Button) findViewById(R.id.btnnick);
        btnseleccionar = (Button) findViewById(R.id.btnseleccionar);


        this.btnnick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato = nick.getText().toString();
                setContentView(R.layout.activity_configuracion);
                TextView txtCambiado = (TextView)findViewById(R.id.txtnick);
                txtCambiado.setText(dato);

                }
        });

        this.btnseleccionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdbFacil.isChecked()){

                    Toast.makeText(Configuracion.this, "elijio nivel facil", Toast.LENGTH_SHORT).show();
                }if(rdbMedio.isChecked()){

                    Toast.makeText(Configuracion.this, "elijio nivel medio", Toast.LENGTH_SHORT).show();
                }if(rdbDificil.isChecked()){

                    Toast.makeText(Configuracion.this, "elijio nivel dificil", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
