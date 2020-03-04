package com.company;

import java.util.Random;

public class odev3 {
    public static void main(String[] args) {
        double dizi[] =new double[100];
        Random rd=new Random();
        double sum = 0;

        for (int i = 0; i <100 ; i++) {
            dizi[i]=rd.nextDouble()*rd.nextInt(10000);
        }

        //fonsiyonu cagırıyorum

        double sonuc=ortalama(dizi);
        System.out.println("sonuc....: "+sonuc);

    }


    public static double ortalama(double dizi[])
    {
        double sum=0;
        for (int i = 0; i <100 ; i++) {
            sum+=dizi[i];
        }
        return sum/100;
    }
}
