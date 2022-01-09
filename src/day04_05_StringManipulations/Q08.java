package day04_05_StringManipulations;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
       
    	
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Lütfen bir kelime giriniz: \nArdýndan Enter tuþuna basýn.");
    	String kelime=scan.next();
    	
    	if (kelime.length()>=3) {
			
    		System.out.println( kelime.substring(kelime.length()-2) + kelime.substring(kelime.length()-2) + kelime.substring(kelime.length()-2)  );
    		
    		
		} 
    	
    	else {
    		System.out.println(kelime);

		}
    	
    	
    	
    	scan.close();
    	
    	
    }
}
