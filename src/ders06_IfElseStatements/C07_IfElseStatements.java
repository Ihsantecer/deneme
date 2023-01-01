package ders06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

     // KULLANICIDAN BİR KAREKTER GİRMESİNİ İSTEYİN. GİRİLEN KAREKTER BÜYÜKSE AYNEN YAZDIRIN, KÜÇÜKSE BÜYÜK YAPIP YAZDIRIN

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir karekter giriniz");
        char krk= scan.next().charAt(0);

        if(krk>='a' && krk<='z'){
            System.out.println((char)(krk-32));
        }else System.out.println(krk);
        // Character.toUpperCase(krk);

    }


}
