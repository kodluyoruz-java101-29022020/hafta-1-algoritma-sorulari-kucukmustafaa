package com.company;
import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        System.out.println("bir secenek seciniz...: ");
        Scanner scanner=new Scanner(System.in);
        byte input=scanner.nextByte();
        if (input < 1 || input > 4) {
            System.out.println("lutfen dogru secenek ile tekrar deneyiniz :)");
            System.exit(1);
        }
        int a,b,sonuc ;
        System.out.print("bir sayi giriniz...: ");
        a=scanner.nextInt();
        System.out.print("bir sayi giriniz...: ");
        b=scanner.nextInt();

        switch (input){
            case 1:
                sonuc=a+b;
                System.out.println("sonuc...: "+sonuc);
                break;
            case 2:
                sonuc=a-b;
                System.out.println("sonuc...: "+sonuc);
                break;
            case 3:
                sonuc=a*b;
                System.out.println("sonuc...: "+sonuc);

                break;
            case 4:
                sonuc=a/b;
                System.out.println("sonuc...: "+sonuc);
                break;
            default:
                System.out.println("lutfen dogru secenek giriniz...: ");
        }
    }
}
