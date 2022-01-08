package day04_05_StringManipulations;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

    	
    	// Kullanýcdan alacgýmýz 3 kelimeli bir isimden her bir kelimenin baþ harifini araya nokta koyarak yazdýralým
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Lütfen 3 kelimeden oluþan bir isim giriniz.");
    	String isim=scan.nextLine();
    	
    	char ilkHarf=isim.toUpperCase().charAt(0);
    	char ikinciHarf=isim.toUpperCase().charAt(isim.indexOf(" ")+1);
    	char ucuncuHarf=isim.toUpperCase().charAt(isim.lastIndexOf(" ")+1);
    	
    	System.out.println(" Ýsminizin baþ harfleri : " + ilkHarf +"." + ikinciHarf+ "."  + ucuncuHarf);


    	scan.close();
    }       
}
