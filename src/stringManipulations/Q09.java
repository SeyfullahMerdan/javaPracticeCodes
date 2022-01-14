package stringManipulations;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
       
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Lütfen bir email adresi giriniz.");
    	String str=scan.nextLine();
    	
    	if (str.length()%2==0) {
			System.out.println("Girilen Stringin ilk yarýsý : " + str.substring(0, str.length()/2)  );
		}
    	
    	if (!(str.length()%2==0)) {
    		System.out.println("Tek uzunlukta bir String girdiniz.");	
		}
    	
    	scan.close();
    	
    	
    }
}
