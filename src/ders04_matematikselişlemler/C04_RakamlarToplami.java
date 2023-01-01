package ders04_matematikselişlemler;

public class C04_RakamlarToplami {


    public static void main(String[] args) {
        //kullanıcının girdiği bir sayının 4 basamaklı bir sayının rakamlar toplamını bulunuz


        int input= 1453;
        int birlerBasamağı=0;
        int rakamlarToplamı=0;

        // 1 birler  basamağını al.
     birlerBasamağı= input%10;
      // 2 briler basamağını rakamlar toplamına ekle
     rakamlarToplamı= rakamlarToplamı+birlerBasamağı;
      // 3 birler basamağından kurtul
     input= input/10;

     // 1 birler  basamağını al.
        birlerBasamağı= input%10;
        // 2 briler basamağını rakamlar toplamına ekle
        rakamlarToplamı= rakamlarToplamı+birlerBasamağı;
        // 3 birler basamağından kurtul
        input= input/10;


        // 1 birler  basamağını al.
        birlerBasamağı= input%10;
        // 2 briler basamağını rakamlar toplamına ekle
        rakamlarToplamı= rakamlarToplamı+birlerBasamağı;
        // 3 birler basamağından kurtul
        input= input/10;


        // 1 birler  basamağını al.
        birlerBasamağı= input%10;
        // 2 briler basamağını rakamlar toplamına ekle
        rakamlarToplamı= rakamlarToplamı+birlerBasamağı;
        // 3 birler basamağından kurtul
        input= input/10;


        System.out.println( "girilen sayıların rakamlar toplamı :" + rakamlarToplamı);




        int amozonsayı= 7856;
        int birinci=0;
        int top= 0;

        // 1 ler basamağını bul.
        // rakamlar toplamına ekle
        // birler basağından kurtul

        birinci= amozonsayı%10;
        top= top+birinci;
        amozonsayı= amozonsayı/10;



        birinci= amozonsayı%10;
        top= top+birinci;
        amozonsayı= amozonsayı/10;



        birinci= amozonsayı%10;
        top= top+birinci;
        amozonsayı= amozonsayı/10;


        birinci= amozonsayı%10;
        top= top+birinci;
        amozonsayı=amozonsayı /10;

        System.out.println("rakamlarToplamı:"+ top);



        int hepsi= 99;
        int sayı1=0;
        int top1=0;

        sayı1= hepsi%10;
        top1= top1+sayı1;
        hepsi= hepsi/10;



        sayı1= hepsi%10;
        top1= top1+sayı1;
        hepsi= hepsi/10;
        System.out.println(top1);







    }
}
