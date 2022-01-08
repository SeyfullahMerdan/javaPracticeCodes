package day04_05_StringManipulations;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
       
    	// Kullanicidan 4 harfli bir kelime isteyin
        //  girilen kelimeyi tersten yazdirin

       Scanner scan=new Scanner(System.in);
       System.out.println("Lütfen 4 harfli bir kelime giriniz.");
       
       String kelime=scan.next();
       
       System.out.println ((kelime.substring(3, 4)) + (kelime.substring(2, 3)) + (kelime.substring(1, 2)) + (kelime.substring(0, 1)));
    	
       
       scan.close();
       
    	
    }
}
