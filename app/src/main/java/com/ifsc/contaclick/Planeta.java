package com.ifsc.contaclick;

import android.graphics.Bitmap;

import java.io.Serializable;

public class Planeta implements Serializable {
    String nome;
    //Bitmap Imagem;
    Integer imagem;

    public Planeta(String nome, Integer imagem) {
        this.nome = nome;
        this.imagem = imagem;

    }
}

