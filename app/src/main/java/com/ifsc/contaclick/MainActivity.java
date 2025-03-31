package com.ifsc.contaclick;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    int i=0;

    EditText edpeso, edaltura;
    TextView tvresultado;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d("ciclo de vida", "mensagem");
        setContentView(R.layout.activity_main);
        edpeso=findViewById(R.id.edpeso);
        edaltura=findViewById(R.id.edaltura);
        tvresultado=findViewById(R.id.tvresultadoimc);
        button=findViewById(R.id.button);

          button.setOnClickListener(v -> {  //calcularIMC
              double peso,altura,imc;
              peso=Double.parseDouble(edpeso.getText().toString());
              altura=Double.parseDouble(edaltura.getText().toString());
              imc=peso/(altura*altura);
              //formatando numero ##,##
              DecimalFormat decimalFormat=new DecimalFormat("##.##");


              tvresultado.setText(Double.toString(imc));});



    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ciclo de vida", "mensagem");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ciclo de vida", "mensagem");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo de vida", "mensagem");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ciclo de vida", "mensagem");
    }
}






