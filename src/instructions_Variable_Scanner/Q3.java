package instructions_Variable_Scanner;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.print("Ad�n�z� Giriniz : ");
		
		// Girilen veriyi ayn� Sat�ra yazd�r�r. 
		// -ln olursa sonu, girilen veri alt sat�ra yazd�r�r
		
		String name=scan.nextLine();
		

		
		
		System.out.print("Soyad�n�z� Giriniz : ");
	    String surName=scan.nextLine();
	    
	    System.out.println("Ya��n�z� Giriniz:");
	    int age=scan.nextInt();
		
	    System.out.println("Boyunuzu Giriniz:");
	    int boy=scan.nextInt() 	;
	    
	    System.out.println("Kilonuzu Giriniz:");
	    int kilo=scan.nextInt() ;
	    
	    System.out.println ("Benim Ad�m:"+name+"\n"+"Soyad�m:"+surName+"\n"+"Yasim:"+age+"\n"+"Boyum:"+boy+"cm"+"\n"+"Kilom:"+kilo+"kg");
	    
	  
	    
	    
	    scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
