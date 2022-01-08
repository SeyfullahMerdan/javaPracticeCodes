package day04_05_StringManipulations;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
      
    	// kullanýcýdan bir e-posta adresi girmesini isteyin, ardýndan “hotmail” içeriyorsa, 
        // “gmail” ile deðiþtirin, örneðin: johnbrown@hotmail.com ==> johnbrown@gmail.com
    	

       Scanner scan=new Scanner(System.in);
       System.out.println("Lütfen bir mail adresi giriniz");
       String mail=scan.next();
       
       if (mail.contains("@hotmail")) {
    	   
    	   System.out.println( mail.replace("@hotmail", "@gmail"));
	}
       else {
    	   System.out.println("baþarý ile kaydedilmiþtir.");
       }
    	
    	
    	
    	scan.close();
    	
    	
    	
    }
}
