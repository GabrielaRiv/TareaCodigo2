package com.example.gabriela.tareacodigo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {
    private EditText numAleatorio;
    private Button btnenviarnum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        numAleatorio = (EditText) findViewById(R.id.numAleatorio);
        btnenviarnum = (Button) findViewById(R.id.btnenviarnum);

        int numeroAleatorio = (int) (Math.random()*50+1);

      /*  if(Integer.parseInt(numAleatorio.getText().toString()) == numeroAleatorio){
            Toast.makeText(this, "Usted ha ganado..." + numeroAleatorio, Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "numero incorrecto, el numero es:" + numeroAleatorio, Toast.LENGTH_SHORT).show();
        }*/

       Toast.makeText(this, "naleatorio" + numeroAleatorio, Toast.LENGTH_SHORT).show();

    }
}
