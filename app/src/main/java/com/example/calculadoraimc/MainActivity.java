package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText edNome,edAltura, edPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNome = findViewById(R.id.edNome);
        edAltura = findViewById(R.id.edAltura);
        edPeso= findViewById(R.id.edPeso);
    }

    public void calculaIMC(View view){

        Intent i = new Intent(this, IMCActivity.class);

        String nome  = edNome.getText().toString();
        Double peso = Double.parseDouble(edPeso.getText().toString());
        Double altura = Double.parseDouble(edAltura.getText().toString());

        i.putExtra("nome",nome);
        i.putExtra("peso", peso);
        i.putExtra("altura", altura);


        startAction(i);
    }


}