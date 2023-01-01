package ders13_NestedForLoop;

public class C04_NestedForlLoop {

    public static void main(String[] args) {
        /*
        aşağıdaki şekli yazdıran bir kod yazınız.

        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
         */

        for (int i = 1; i <=4; i++) {

            for (int j = 1; j <=6 ; j++) {

                System.out.print("* ");

            } System.out.println("");

        }

        /*
        #Hocanın Yaptığı#
        // 1-4 arasindaki sayilar icin carpim tablosu olusturalim
        // dis dongu satirlari kontrol eder
        for (int i = 1; i <=5 ; i++) {
            // ic dongu her satirda olan degerleri kontrol eder
            for (int j = 1; j <=5 ; j++) {
                System.out.print(i*j + " " );
            }
            // ic dongu bittiginde javayi alt satira indirmeliyiz
            System.out.println("");
        }
         */

    }
}
