package com.company;

import java.util.Random;

public class Odev5 {
    public static void main(String[] args) {
        final int ustLimit=10000;
        int dizi[] = new int[100];
        Random rd=new Random();
        for (int i = 0; i <100 ; i++) {
            dizi[i]=rd.nextInt(ustLimit);
        }

        System.out.println("cift sayilar");
        for (int i = 0; i <100 ; i++) {
            if (dizi[i]%2==0) {
                System.out.println(dizi[i]);
            }

        }

        System.out.println("tek sayilar");
        for (int i = 0; i <100 ; i++) {
            if (dizi[i]%2==1) {
                System.out.println(dizi[i]);
            }

        }


    }
}
