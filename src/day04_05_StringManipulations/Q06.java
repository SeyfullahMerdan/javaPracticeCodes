package day04_05_StringManipulations;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
      
    	// kullan�c�dan bir e-posta adresi girmesini isteyin, ard�ndan �hotmail� i�eriyorsa, 
        // �gmail� ile de�i�tirin, �rne�in: johnbrown@hotmail.com ==> johnbrown@gmail.com
    	

       Scanner scan=new Scanner(System.in);
       System.out.println("L�tfen bir mail adresi giriniz");
       String mail=scan.next();
       
       if (mail.contains("@hotmail")) {
    	   
    	   System.out.println( mail.replace("@hotmail", "@gmail"));
	}
       else {
    	   System.out.println("ba�ar� ile kaydedilmi�tir.");
       }
    	
    	
    	
    	scan.close();
    	
    	
    	
    }
}
