package ders06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        // KULLANICIDAN ÜÇGENİN ÜÇ KENARINI ALIN
        // ÜÇGEN ÜÇ KENAR İSE "EŞKENAR" ÜÇGEN YAZDIRIN değilse "EŞKENAR DEĞİL YAZDIRIN

        Scanner scan= new Scanner(System.in);
        System.out.println( "lütfen kenarları yazınız");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("eşkenar üçgen");
        } else {
            System.out.println("eşkenar değil");
        }



    }
}
