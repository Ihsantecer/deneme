package ders02_dataTurleri_scanner;

import java.util.Scanner;
import java.util.StringJoiner;

public class C05_Scanner {//Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz");
        String isim= scan.nextLine();
        System.out.println("Lütfen soyismizi giriniz");
        String soyisim= scan.nextLine();
        System.out.println("Lütfen eşinizin adını girin");
        String esismi= scan.nextLine();
        System.out.println("seni seviyorum");
        System.out.println("ahmet +" + " şeyma"+"="+"leyla" );

    }






}
