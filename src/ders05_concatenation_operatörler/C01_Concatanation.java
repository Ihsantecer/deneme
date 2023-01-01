package ders05_concatenation_operatörler;

public class C01_Concatanation {


    public static void main(String[] args) {
        String s1= "Java";
        String s2= "Güzeldir";
        String s3= "";
        String s4= " ";

        int sayi1= 4;
        int say2= 3;
        // java güzeldir7
        System.out.println(s1+s4+s2+(sayi1+say2));
        // java güzeldir 12
        System.out.println(s1+s4+s2+s4+sayi1*say2);
        //7 java güzeldir
        System.out.println(sayi1+say2+s4+s1+s4+s2);
        //34 Java
        System.out.println(s3+say2+sayi1+s4+s1);
        //java7 güzeldir43
        System.out.println(s1+(sayi1+say2)+s4+s2+sayi1+say2);

    }
}
