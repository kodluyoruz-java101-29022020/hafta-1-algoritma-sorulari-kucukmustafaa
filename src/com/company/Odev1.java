package com.company;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        final String sabit="cocuklar";
        System.out.print("bir kelime girin...: ");
        Scanner scanner=new Scanner(System.in);
        String inputString=scanner.nextLine();
        if (sabit.equals(inputString))
        {
            System.out.println("Giriş Başarılı!");
        }
        else {
            System.out.println("Giriş Başarısız");
        }

    }
}
