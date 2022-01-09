package day04_05_StringManipulations;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
       
    	// Kullanýcýdan tek seferde alacagýnýz 2 kelimelik ad soyadý 2 ayrý kelimeye ayýrýnýz,
        // ad ayrý soyad ayrý sekilde ekrana yazdýrýnýz.

     Scanner scan=new Scanner(System.in);
     System.out.println("Lütfen aralarda boþlu býrakarak adýnýzý ve soyadýnýzý giriniz. \nArdýndan Enter tuþuna basýnýz.");
     String adSoyad=scan.nextLine().toUpperCase();


     String ad=adSoyad.substring(0, adSoyad.indexOf(" "));
     String soyad=adSoyad.substring( adSoyad.indexOf(" ")+1);
      
   
     System.out.println( "Adýnýz: "  + ad );
     System.out.println( "Soyadýnýz: " + soyad );

    
     scan.close();
      
    }
}
