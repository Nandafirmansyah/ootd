package com.polinema.aplikasiss;

import java.util.ArrayList;
import java.util.List;

public class ImageAssets {


    //Variabel ini adalah pengelompokan untuk bodi , dan menyimpan data
    private  static List<Integer> bodies = new ArrayList<Integer>(){{
        add(R.drawable.body1);
        add(R.drawable.body2);
        add(R.drawable.body3);
        add(R.drawable.body4);
    }};

    //Variabel ini adalah pengelompokan untuk kaki , dan menyimpan data
    private  static List<Integer> legs = new ArrayList<Integer>(){{
        add(R.drawable.legs1);
        add(R.drawable.legs2);

    }};


    //ini adalah method yang digunakan untuk mengambil/memanggil variabel body
    public static List<Integer> getBodies(){
        return bodies;
    }

    //ini adalah method yang digunakan untuk mengambil/memanggil variabel leg
    public static List<Integer> getLegs(){
        return legs;
    }


}