package com.ifsc.contaclick;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlanetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planeta);
        Bundle budle=getIntent().getExtras();
        String msg=budle.getString("mensagem");
        TextView textView = findViewById(R.id.textView);
        textView.setText(msg);

        Bundle b=getIntent().getExtras();
        b.get("nome");
        TextView tv=findViewById(R.id.textView);
        tv.setText(b.get("nome").toString());


    }
}