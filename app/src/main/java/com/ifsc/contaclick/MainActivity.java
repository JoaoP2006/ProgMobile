package com.ifsc.contaclick;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv=findViewById(R.id.textView);
        tv.setText(getString(R.string.app_name));

        Button b=findViewById(R.id.button);

        b.setOnclickListener(v -> {

        })
        b.setOnclickListener(    {
            @Override
                    public void onClick(View v) {
            tv.setText(Integer.toString(i));
            i++
                }
            )}





    }
    }
