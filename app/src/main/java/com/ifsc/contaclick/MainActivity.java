package com.ifsc.contaclick;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    int i = 0;

    EditText edpeso, edaltura;
    TextView tvresultado;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        edpeso = findViewById(R.id.edpeso);
        edaltura = findViewById(R.id.edaltura);
        tvresultado = findViewById(R.id.tvresultadoimc);
        button = findViewById(R.id.button);

<<<<<<< HEAD
        button.setOnClickListener(v -> {  //calcularIMC
            Intent intent = new Intent(getApplicationContext(), MainActivityB.class);
            String msg= edpeso.getText().toString();
            intent.putExtra("mensagem",msg);
            startActivity(intent);
=======
          button.setOnClickListener(v -> {  //calcularIMC
              double peso,altura,imc;
              peso=Double.parseDouble(edpeso.getText().toString());
              altura=Double.parseDouble(edaltura.getText().toString());
              imc=peso/(altura*altura);
              //formatando numero ##,##
              DecimalFormat decimalFormat=new DecimalFormat('##.##');

>>>>>>> 87fdd6989c9cd97d48730446e51bd6e13a5b39b1




        });


    }
}






