package ders13_NestedForLoop;

public class C03_NestedForLoop {

    public static void main(String[] args) {
        // 1- arasindaki sayilar icin carpim tablosu olusturalim
        // dis dongu satirlari kontrol eder
        for (int i = 1; i <=5 ; i++) {
            // ic dongu her satirda olan degerleri kontrol eder
            for (int j = 1; j <=5 ; j++) {
                System.out.print(i*j + " " );
            }
            // ic dongu bittiginde javayi alt satira indirmeliyiz
            System.out.println("");
        }
    }
}
