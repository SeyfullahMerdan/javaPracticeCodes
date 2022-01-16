package forLoop;

import java.util.Scanner;

public class Q08 {
    
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        // Kullanicidan bir String isteyin. Kullanicinin girdigi                          // scanner-syso-yazi
        // String'in palindrome olup olmadigini kontrol eden bir program yazin.       // tersten ve sonra yzılış aynı ise 

        
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Lütfen bir String giriniz : " );
    	
    	String str=scan.nextLine().trim().toLowerCase();
    	
    	palindrome(str);
         
    	
 
	}

	
	
	private static void palindrome(String str) {
		
		
		String trs="";
		
		for (int i = str.length()-1; i >= 0; i--) {
			trs+=str.substring(i, i+1);
		}
	
		
		if (trs.equals(str)) {
			System.out.println("Girilen ifade Polindrom");
		} else {
			System.out.println("Girilen ifade Polindrom degildir");
		}
		
		
	}
	

	

	
}

