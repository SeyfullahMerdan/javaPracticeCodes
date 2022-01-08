package day04_05_StringManipulations;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanýcýdan alacagýnýz bir stringde boþluk karakterinin olup olmadýgýný kontrol ediniz.
        
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Lütfen bir String giriniz.");
    	String str=scan.nextLine();
    	
    	boolean varMi=str.contains(" ");
    	
    	System.out.println("Girilen Stringde boþluk var mý? \n:"+varMi);
    	
    	
    	// Kullanýcýdan alacagýnýz bir stringin bos olup olmadýgýný kontrol ediniz.
    	
    	str.isEmpty();    // bunu yazmaya da gerek yok. Direk syso içinde yapabilriz.
    	System.out.println("Girilen String boþ mu? \n:"+str.isEmpty());
    	
    	
    	scan.close();
    	
    	
    	
    	
    	
    	
    }
}

