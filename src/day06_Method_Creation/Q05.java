package day06_Method_Creation;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		
		// Girilen bir ay numaras�na g�re, ay�n ka� g�n oldugunu say� ile yazd�r�n.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir ay numaras� giriniz.");
		int ayNo=scan.nextInt();
		
		switch (ayNo) {
		case 1:
		case 3:	
		case 5:	
		case 7:	
		case 8:	
		case 10:
		case 12:
			System.out.println("Girdiginiz ay 31 g�nd�r.");
			break;
			
		case 4:
		case 6:	
		case 9:	
		case 11:
			
			System.out.println("Girdi�iniz ay 30 g�nd�r.");
			break;
		case 2:
			System.out.println("L�tfen y�l� da giriniz : ");
			int yil=scan.nextInt();
			if (yil%4==0) {
				System.out.println("Girdiginiz y�l 29 g�nd�r");
			} else {
				System.out.println("Girdiginiz y�l 28 g�nd�r");
			}
			break;
			
		default:
			System.out.println("Hatal� giri� yapt�n�z. ");

			break;
		}
		
		scan.close();
	}

}
