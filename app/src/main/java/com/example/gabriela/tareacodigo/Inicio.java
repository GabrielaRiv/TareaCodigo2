package com.example.gabriela.tareacodigo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {
    private EditText numAleatorio;
    private Button btnenviarnum;
    private TextView txtnumero;
    int numeroAleatorio = (int) (Math.random()*50+1);
    int cout = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        numAleatorio = (EditText) findViewById(R.id.numAleatorio);
        txtnumero = (TextView) findViewById(R.id.txtnumero);
        btnenviarnum = (Button) findViewById(R.id.btnenviarnum);

        btnenviarnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(numAleatorio.getText().toString()) == numeroAleatorio){
                    Toast.makeText(Inicio.this, "Usted ha ganado..." + numeroAleatorio, Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(Inicio.this, "numero incorrecto, el numero es:" + numeroAleatorio, Toast.LENGTH_SHORT).show();

                }
            }
        });

      // Toast.makeText(this, "naleatorio" + numeroAleatorio, Toast.LENGTH_SHORT).show();

    }
}
