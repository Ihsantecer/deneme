package ders07_NestedIfElseStatements;

import java.util.Scanner;


public class C04_NesteedIfElseStatement {
    public static void main(String[] args) {
        // Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        //Erkek 65 yas ve uzeri emekli olabilir. Cinsiyet ve yasini
        // dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen yaşınızı ve cinsiyetinizi giriniz. cinsiyetinizi erkek için=e," +
                "kadın için 'k' şeklinde giriniz ");
        int yas= scan.nextInt();
        char cins= scan.next().charAt(0);


        if (yas<15){
            System.out.println("geçersiz yaş girişi");
        } else if (yas>15 && yas<60) {
            if (cins=='e' || cins=='E') System.out.println("emekli olmak için"+(65-yas)+"" +
                    " yıl kadar beklemeniz gerekmektedir");
            else if (cins=='k' || cins=='K') {
                System.out.println("emekli olmak için"+(60-yas)+" yıl kadar beklemelisiniz");

            }


        } else if (yas>60 && yas<65) {
            if (cins=='k' || cins=='K'){
                System.out.println("emekli olabilirsiniz");

            } else if (cins=='e' || cins=='E') {
                System.out.println("Emekli olmak için"+ (65-yas)+" yıl kadar bekleyiniz");

            }

        }else System.out.println("emekli olabilirsiniz");

    }
}




