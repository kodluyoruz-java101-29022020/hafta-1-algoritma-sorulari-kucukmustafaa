package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String sabit="kk";
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
