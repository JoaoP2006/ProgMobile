package com.ifsc.contaclick;

import java.util.ArrayList;

public class PlanetaDao {

    ArrayList<Planeta> planetas;

    public PlanetaDao(){

        String [] nomes = new String[]{"Marte","Venus","Terra", "Saturno", "Netuno", "Jupiter", "Urano"};
        Integer[] imagens= new Integer[]{R.drawable.mars,R.drawable.venus,R.drawable.earth,R.drawable.saturn,R.drawable.neptune,R.drawable.jupter
        ,R.drawable.uranus};
        for (int i=0; i< nomes.length; i++){
            planetas.add(new Planeta(nomes[i], imagens[i]));
        }
    }

   public ArrayList<Planeta> getPlanetas(){
        return new ArrayList<>();
    }
}
