package ders11_stringManupulation;

public class C04_replaceAll {
    public static void main(String[] args) {
        // Kullanicinin girdigi metinde
        // harf disinda kalan tum karakterleri temizleyen bir kod yazin
        // NOT : space silinmemeli
        String input= "9%H2av*(a  co_k 1*guzel";
        input=input.replaceAll("\\d",""); // Ja+va cok *guzel
        input=input.replace(" ","5"); // Ja+va5cok5*guzel
        input=input.replaceAll("\\W","");// Java5cok5guzel
        input=input.replace("_","");
        input=input.replace("5"," "); // Java cok guzel
        input=input.replaceAll("\\s+"," ");
        System.out.println(input);
        String str= "Hayat*3 de*vam 3ed=i9yor";
        str=str.replaceAll("\\d ", "");
        System.out.println(str);
        str=str.replaceAll(" ", "5");
        str=str.replaceAll("\\W","");
        str=str.replace("5"," ");
        str=str.replaceAll("\\d", "");
        str=str.replace(str.substring(4,5)," ");
        System.out.println(str);



        System.out.println(str);
    }
}
