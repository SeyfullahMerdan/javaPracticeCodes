package day04_05_StringManipulations;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
       
    	// Kullan�c�dan tek seferde alacag�n�z 2 kelimelik ad soyad� 2 ayr� kelimeye ay�r�n�z,
        // ad ayr� soyad ayr� sekilde ekrana yazd�r�n�z.

     Scanner scan=new Scanner(System.in);
     System.out.println("L�tfen aralarda bo�lu b�rakarak ad�n�z� ve soyad�n�z� giriniz. \nArd�ndan Enter tu�una bas�n�z.");
     String adSoyad=scan.nextLine().toUpperCase();


     String ad=adSoyad.substring(0, adSoyad.indexOf(" "));
     String soyad=adSoyad.substring( adSoyad.indexOf(" ")+1);
      
   
     System.out.println( "Ad�n�z: "  + ad );
     System.out.println( "Soyad�n�z: " + soyad );

    
     scan.close();
      
    }
}
