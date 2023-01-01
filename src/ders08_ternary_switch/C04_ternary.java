package ders08_ternary_switch;

public class C04_ternary {
    public static void main(String[] args) {
        /* üçgenin kenar uzunluğunu al
        eşkenar ise eşkaner değilse eşkenar değil yazdırın

         */
        int kenar1=10;
        int kenar2=12;
        int kenar3=10;


        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "eşkenar üçgen" : "eşkenar değil");

        // kullanıcan 2 sayı alın büyük olmayanı yazdırın
        int sayı1= 10;
        int sayı2= 11;
        System.out.println( sayı1>sayı2 ? sayı2 : sayı1);
    }
}
