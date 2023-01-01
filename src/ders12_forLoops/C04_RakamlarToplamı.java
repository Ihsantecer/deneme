package ders12_forLoops;

public class C04_RakamlarToplamı {

    public static void main(String[] args) {
        // kullanicinin verdigi sayinin rakamlar toplamini bulun
        long sayi= 43011238841L;
        String sayiStr= ""+sayi;
        long birlerBasamagi= 0;
        long rakamlarToplami=0;
        for (int i = 1; i <=sayiStr.length() ; i++) {
            birlerBasamagi=sayi%10;
            rakamlarToplami= rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlarToplami);



        int sayı1=12839303;
        String strsayı1= ""+sayı1;

        int bir=0;
        int toprkm=0;

        for (int i = 1; i <=strsayı1.length() ; i++) {

           bir= sayı1%10;
           toprkm=toprkm+bir;
           sayı1=sayı1/10;
        }
        System.out.println(toprkm);
    }


}
