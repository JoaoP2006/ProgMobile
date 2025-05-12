package com.ifsc.contaclick;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;


import java.util.List;

public class AdapterPlaneta extends ArrayAdapter {


     int mresourcer;

    public AdapterPlaneta(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        mresourcer =resource;
    }

    @NonNull
    @Override


    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());


        convertView= layoutInflater.inflate(mresourcer,parent,false);

        TextView.tvnome= convertView.findViewById(R.id.textView);
        ImageView im = convertView.findViewById(R.id.textView);

        tvnome.setText(this.getItem(position).nome);
        im.setImageResource(this.getItem(position).imagem);

        return convertView;
    }



}
