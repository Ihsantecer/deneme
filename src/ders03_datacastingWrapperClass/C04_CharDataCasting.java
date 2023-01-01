package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C04_CharDataCasting {

    public static void main(String[] args) {


        System.out.println('a'+'b');

        Scanner scan= new Scanner( System.in);
        System.out.println("lütfen bir karekter giriniz");
        char girilenVeri= scan.next().charAt(0);
        System.out.println(""+ (char)  (girilenVeri+1) +(char) (girilenVeri+2)+(char) (girilenVeri+3));
        System.out.println("LÜTFEN BİR KAREKTER SEÇİNİZ");
        char newCharecter = scan.next().charAt(0);
        System.out.println(""+(char)(newCharecter+1)+(char) (newCharecter+2)+(char) (newCharecter+3));



        Scanner imput  = new Scanner(System.in);

        System.out.println("2.lütfen bir karekter giriniz");
        char krk = imput.next().charAt(0);
        System.out.println(""+(char)(krk+1) + (char) (krk+2)+ (char )(krk+3) ) ;

    }





}
