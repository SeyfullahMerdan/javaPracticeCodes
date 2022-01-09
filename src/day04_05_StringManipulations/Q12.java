package day04_05_StringManipulations;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
		/*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */
        
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Lütfen bir email adresi giriniz.");
    	String mail=scan.next();
    	
    	if (!mail.contains("@")) {
			System.out.println("Geçerli bir email adresi giriniz.");
		} else if (   mail.substring(mail.indexOf("@")+1).equalsIgnoreCase("gmail.com")) {
			System.out.println("Email adresiniz onaylandý.");
		} else { 
			System.out.println("Lütfen gmail adresinizi giriniz.");			
		}
    	
    	scan.close();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

}
