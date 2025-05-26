package com.ifsc.contaclick;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Integer i = 0;
    SQLiteDatabase db;
    EditText editText;


    Button buttonInsere;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=openOrCreateDatabase("banco",MODE_PRIVATE,null);

        db.execSQL("CREATE TABLE notas (id INTEGER PRIMARY KEY AUTOINCREMENT,txt TEXT)");
        buttonInsere=findViewById(R.id.Button);
        editText=findViewById(R.id.editTextText);
        listView=findViewById(R.id.listView);
        buttonInsere.setOnClickListener (v -> {
            String msg = editText.getText().toString();
            insereNota(msg);
        });
    }
       public void listagemNotas(){

           Cursor cursor = db.rawQuery("SELECT * FROM notas", null);
           cursor.moveToFirst();
           while (!cursor.isAfterLast()) {
               int coluna = cursor.getColumnIndex('txt');
               ListaNotas.add(cursor.getString(coluna));
               cursor.moveToNext();
           }
           ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,
                   android.R.layout.simple_list_item_1, android.R.id.text1,listaNotas);
           ListView.setAdapter(adapter);



           }







    public void insereNota (String txt){
        ContentValues cv = new  ContentValues();
        cv.put("txt",txt);
     db.insert("notas", null , cv);
    }
}






