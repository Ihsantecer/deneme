package ders04_matematikselişlemler;

public class C06_Pre_Post_İncriment {
    public static void main(String[] args) {

        int a= 10;
        // a variablenin değerini yazdırıp sonra a nın değerini 1 artırın
        // a variablenın  değerini 1 artırın sonra yazdırın

        System.out.println("a:"+a);//10
        a++; // 11 kulanıcı konsolda görmedi

        int b= 10;
        b++;
        System.out.println("b:"+b);//11

        int c= 10;
        //C   variablenin değerini yazdırıp sonra a nın değerini 1 artırın
        System.out.println("c:"+ c++); //10 konsolda
        int d = 10;
        // d variablenın  değerini 1 artırın sonra yazdırın.

        System.out.println("d:"+ (++d)); // 11 konsolda



        int t= 10;
        t= t-1;
        t -= 1;
        t--;
        --t;
        System.out.println(t);



        /*
        c++ eya ++d yi yazdırma veya atama işleminde kullanırsanız
        c++ post incriment denir: önce işlemi yapar, sonra artırmayı yapar.
        ++d pre incriment denir: önce toplamayı yapar sonra işlemi.
         */












    }
}
