package day04_05_StringManipulations;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

    	
    	// Kullan�cdan alacg�m�z 3 kelimeli bir isimden her bir kelimenin ba� harifini araya nokta koyarak yazd�ral�m
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("L�tfen 3 kelimeden olu�an bir isim giriniz.");
    	String isim=scan.nextLine();
    	
    	char ilkHarf=isim.toUpperCase().charAt(0);
    	char ikinciHarf=isim.toUpperCase().charAt(isim.indexOf(" ")+1);
    	char ucuncuHarf=isim.toUpperCase().charAt(isim.lastIndexOf(" ")+1);
    	
    	System.out.println(" �sminizin ba� harfleri : " + ilkHarf +"." + ikinciHarf+ "."  + ucuncuHarf);


    	scan.close();
    }       
}
