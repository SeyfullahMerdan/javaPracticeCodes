package day04_05_StringManipulations;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullan�c�dan alacag�n�z bir stringde bo�luk karakterinin olup olmad�g�n� kontrol ediniz.
        
    	Scanner scan=new Scanner(System.in);
    	System.out.println("L�tfen bir String giriniz.");
    	String str=scan.nextLine();
    	
    	boolean varMi=str.contains(" ");
    	
    	System.out.println("Girilen Stringde bo�luk var m�? \n:"+varMi);
    	
    	
    	// Kullan�c�dan alacag�n�z bir stringin bos olup olmad�g�n� kontrol ediniz.
    	
    	str.isEmpty();    // bunu yazmaya da gerek yok. Direk syso i�inde yapabilriz.
    	System.out.println("Girilen String bo� mu? \n:"+str.isEmpty());
    	
    	
    	scan.close();
    	
    	
    	
    	
    	
    	
    }
}

