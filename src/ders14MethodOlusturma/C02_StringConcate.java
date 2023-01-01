package ders14MethodOlusturma;

import java.util.Scanner;

public class C02_StringConcate {

    // verilen 2 stringi aralarında tek boşluk olan main methoda döndüren bir method  yazınız

    public static void main(String[] args) {


         String str1= "Java";
         String str2= " candır";

        System.out.println(birlestirMethodu(str1, str2));

        System.out.println(birlestirMethodu("bu da oldu", "yalan dünya"));

    }

    public static String birlestirMethodu( String str1,  String str2){



            return str1 + " "+ str2;


    }
}
