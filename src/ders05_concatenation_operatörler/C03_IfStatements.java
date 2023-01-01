package ders05_concatenation_operatörler;

import java.util.Scanner;

public class C03_IfStatements{
    public static void main(String[] args) {


        // kullanicidan iki tamsayi alin
        // eger birinci sayi 100'den buyukse , "ilk sayi 100'den buyuk" yazdirin
        // eger ikinci sayi ciftse, "ikinci sayi cift yazdirin"
        // eger ilk sayi, ikinci sayidan buyukse , "ilk sayi daha buyuk" yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 4 tamsayi giriniz ilk 2 sayıyla ilgili işlemleri önce son iki \n" +
                "sayıyla ilgili işemleri sonra yapınız");
        int s1= scan.nextInt();
        int s2= scan.nextInt();
        // eger birinci sayi 100'den buyukse , "ilk sayi 100'den buyuk" yazdirin
        if (s1>100){
            System.out.println("ilk sayi 100'den buyuk");
        }
        // eger ikinci sayi ciftse, "ikinci sayi cift yazdirin"
        if (s2%2==0){
            System.out.println("ikinci sayi cift");
        }
        // eger ilk sayi, ikinci sayidan buyukse , "ilk sayi daha buyuk" yazdirin
        if (s1>s2){
            System.out.println("ilk sayi daha buyuk");
        }


        int sayı1= scan.nextInt();
        int sayı2= scan.nextInt();

        if (sayı1<sayı2){
            System.out.println("sayı1, sayı2'yi döver");
        }
        if (sayı1%2==0){
            System.out.println("sayı1 çift sayıdır");}

        if (sayı1>sayı2){
            System.out.println("ilk sayı ikinci sayıyı yutar");
        }




    }


}




