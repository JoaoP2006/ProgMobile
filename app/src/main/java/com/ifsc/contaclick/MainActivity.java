package com.ifsc.contaclick;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Integer i = 0;
    String [] nomes = new String[]{"Marte","Venus","Terra", "Saturno", "Netuno", "Jupiter", "Urano"};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listview);

        ArrayAdapter<String> a=new ArrayAdapter(this,
                R.layout.item_lista,
                R.id.textVieww
                ,nomes);

        lv.setAdapter(a);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i= new Intent(getApplicationContext(), PlanetaActivity.class);
                i.putExtra("nome",nomes[position]);
                startActivity(i);

            }
        });



    }
}






