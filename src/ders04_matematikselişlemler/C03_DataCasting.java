package ders04_matematikselişlemler;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {
        // kullanıcıdan 2 tam sayı alın, sonucu double olarak yazdırın.


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 4 tam sayı giriniz");


        int sayı1= scan.nextInt(); // 20
        int sayı2= scan.nextInt(); // 6
        System.out.println(sayı1/sayı2); // 3

        double ondalıklıSayı= (double) (sayı1/sayı2);
        double dogruSonuc= ((double) sayı1) / sayı2;
        System.out.println(ondalıklıSayı);
        System.out.println(dogruSonuc);

        int sayı3= scan.nextInt();
        int sayı4= scan.nextInt();
        double dblsnc=(double)(sayı3/sayı4);


        System.out.println(dblsnc);
    }
}
