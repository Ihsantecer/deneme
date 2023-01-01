package ders04_matematikselişlemler;

import java.util.Scanner;

public class C02_DataCasting {


    public static void main(String[] args) {

        // iki double sayı alın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen iki sayı giriniz");
        double sayı1= scan.nextDouble();
        double sayı2= scan.nextDouble();

        int bölmeSonucu=(int)(sayı1/ sayı2);

        System.out.println(bölmeSonucu);







    }
}
