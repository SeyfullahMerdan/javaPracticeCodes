package day04_05_StringManipulations;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Lütfen bir isim giriniz.");
    	String isim=scan.nextLine();
    	
    	System.out.println("************ if ile*************");
    	
    	char c1=isim.charAt(0);  // ilk harf
    	char c2=isim.charAt(1);  // ikinci harf
    	char c3=isim.charAt(2);   // üçüncü harf
    	
    	if (isim.length()==3) {
    		if (c1!=c2 &&  c2!=c3 && c1!=c3) {
				System.out.println("Girilen isim 3 harfli ve unique");
			} else { 
				System.out.println("Girilen isim 3 harfli ve ama unique deðil");
			}
    		
		}
    	else { 
    		System.out.println("Girilen isim 3 harfli degildir.");
    	}
    	
    	
    	
    	System.out.println("**************ternary ile************");
    	
    	
    	System.out.println( isim.length()==3 ? (  c1!=c2 &&  c2!=c3 && c1!=c3 ?  "Girilen isim 3 harfli ve unique" :  "Girilen isim 3 harfli ve ama unique deðil"):  "Girilen isim 3 harfli degildir." );
    
    	
    scan.close();
    
    }
    
}