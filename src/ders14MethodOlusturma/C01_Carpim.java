package ders14MethodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

    // main method içerisinde kullanıcıdan 2 sayı alın, bu iki sayıyı paremetre olarak kabul edip
    // çarpımlarını bize döndüren bir method oluşturun

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println(" iki sayı gir");
         double sayi1= scan.nextDouble();
         double sayi2= scan.nextDouble();

        System.out.println(carpimMethodu(sayi1, sayi2));

        double sonuc= carpimMethodu(sayi1,sayi2);



    }


      public static double carpimMethodu (double sayı1, double sayı2){
          System.out.println( "çarpım methodu çalıştı");
        return sayı1*sayı2;
      }




}


