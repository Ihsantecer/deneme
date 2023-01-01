package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C03_dataCasting {

    public static void main(String[] args) {

        // kullanıcıdan bir tam sayı alıp lullanıcı kaç girerse girsin -128 ile +128 /n yazdıracak bi kod yazınız./é!''^^?\


        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen bir tam sayı \n + giriniz");

        int girilensayı= scan.nextInt();
        byte dönüşensayı= (byte) girilensayı;

        System.out.println(dönüşensayı);

        System.out.println("girdiğiniz'" + girilensayı+ "'nın dönüşmüş hali=" +dönüşensayı+ "dır");











    }

}
