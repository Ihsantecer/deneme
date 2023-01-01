package ders14MethodOlusturma;

public class C03_StringTerseCevirme {

    public static void main(String[] args) {
        String input= "Java kod yazdıkça öğrenilir";

        System.out.println(stringiTerseCevir(input));

    }


    public static String stringiTerseCevir (String input){

          String ters="";
        for (int i =input.length()-1; i>=0 ; i--) {

            ters=ters+input.charAt(i);


        }
        return ters;
    }
}
