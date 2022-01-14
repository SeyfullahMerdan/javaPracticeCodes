package instructions_Variable_Scanner;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.print("Adýnýzý Giriniz : ");
		
		// Girilen veriyi ayný Satýra yazdýrýr. 
		// -ln olursa sonu, girilen veri alt satýra yazdýrýr
		
		String name=scan.nextLine();
		

		
		
		System.out.print("Soyadýnýzý Giriniz : ");
	    String surName=scan.nextLine();
	    
	    System.out.println("Yaþýnýzý Giriniz:");
	    int age=scan.nextInt();
		
	    System.out.println("Boyunuzu Giriniz:");
	    int boy=scan.nextInt() 	;
	    
	    System.out.println("Kilonuzu Giriniz:");
	    int kilo=scan.nextInt() ;
	    
	    System.out.println ("Benim Adým:"+name+"\n"+"Soyadým:"+surName+"\n"+"Yasim:"+age+"\n"+"Boyum:"+boy+"cm"+"\n"+"Kilom:"+kilo+"kg");
	    
	  
	    
	    
	    scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
