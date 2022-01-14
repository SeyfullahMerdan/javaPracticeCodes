package stringBuilders;

import java.util.Scanner;

public class Q01SBuilder {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Metin girin: ");
		String metin=scan.nextLine();
		
		StringBuilder sb=new StringBuilder(metin);
		
		String tersMetin=sb.reverse().toString();
		
		 if (tersMetin.equalsIgnoreCase(metin)) {
	            
	            System.out.println("polindrome");
	        } else {
	            System.out.println("polindrome degil");
	        }
		
		
		

	}

}
