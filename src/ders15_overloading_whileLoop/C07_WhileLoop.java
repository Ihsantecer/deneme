package ders15_overloading_whileLoop;

public class C07_WhileLoop {

    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While lobbop kullabnbbbbbb bnbcnarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.
        int sayi=-3;
        int us= 5;
        usHesapla(sayi,us);
    }

    public static void usHesapla(int sayi, int us){
        int sonuc=1;
        while (us>0){
            sonuc = sonuc*sayi;
            us--;
        }
        System.out.println(sonuc);
    }

}
