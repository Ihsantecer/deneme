package ders08_ternary_switch;

public class C02_ternary {

    public static void main(String[] args) {

        String str1= "ALİ";
        String str2= "ALI";
        //verilen iki metin ayını ise aynı
        // farklı ise farklı
        if (str1.equals(str2)){
            System.out.println("metinler aynI");

        }else {
            System.out.println("metinler farklı");
        }
        System.out.println(str1.equals(str2) ? "metinler aynı" : "metinler farklı");
    }
}
