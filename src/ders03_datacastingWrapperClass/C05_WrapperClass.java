package ders03_datacastingWrapperClass;

import org.w3c.dom.ls.LSOutput;

public class C05_WrapperClass {
    public static void main(String[] args) {



        int  sayı= 10;
        String str= "Java çok güzel";
    /*
    java primitive data türleri için bazı hazır methodları kullanılması için WrapperClass kullanır
     */


        char krk= 'b';
        Character krkWrapper='c';
        krkWrapper.charValue();

        System.out.println( Character.isLetter( '5')); // 5 bir harf midir// false
        System.out.println( Character.isDigit('7'));   // true

        String str1= "123";
        String str2= "12";
        // str1 ve str2'nin değerlerini matematiksel olarak toplatın.
        System.out.println(str1+str2);// 12312
        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2));

       // Integer.parseInt(str) içine yazılan str rakamlardan oluşuyorsa str' int'e çevirir.
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);








    }




}
