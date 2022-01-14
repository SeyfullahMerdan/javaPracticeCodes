package stringManipulations;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
       
    	// Kullanicidan 4 harfli bir kelime isteyin
        //  girilen kelimeyi tersten yazdirin

       Scanner scan=new Scanner(System.in);
       System.out.println("Lütfen 4 harfli bir kelime giriniz.");
       
       String kelime=scan.next();
       
      // System.out.println ((kelime.substring(3, 4)) + (kelime.substring(2, 3)) + (kelime.substring(1, 2)) + (kelime.substring(0, 1)));
    	
       String yeniKelime="";
       for (int i=(kelime.length()-1); i<0 ; i--) {
    	   yeniKelime+=kelime.substring(kelime.indexOf(i),kelime.indexOf(i+1));
	}
       System.out.println( "Girilen kelimenin reversi: " + yeniKelime);
       
       
       
       
       scan.close();
       
    	
    }
}
