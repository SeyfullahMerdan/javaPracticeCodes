package scanner_IfStatement_MatematikselISlemler;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		// Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
				//  dort islemden biri ile isleme koyup sonucun yazdiriniz.
				
				
				Scanner scan=new Scanner (System.in);
				System.out.println("L�tfen iki sayi giriniz : ");
				double sayi1=scan.nextDouble();
				double sayi2=scan.nextDouble();
				
				System.out.println("toplama i�in 1 \n��karma i�in 2 \n�arpma i�in 3 \nb�lme i�in 4 ");   // \n alt alta yazd�r�r....
				
				int islem=scan.nextInt();
				
				if (islem==1) {
					System.out.println("girdiginiz sayilarin toplam� : "+(sayi1+sayi2));
				}
				
				else if (islem==2 ) { 
					System.out.println("girdiginiz sayilarin farki : "+(sayi1-sayi2));
					
				}
				
				else if (islem==3 ) { 
					System.out.println("girdiginiz sayilarin �arp�m� : "+(sayi1*sayi2));
					
				}
				
				else if (islem==4 ) { 
					System.out.println("girdiginiz sayilarin farki : "+(sayi1/sayi2));
					
				}
				
				else {
					System.out.println("Hatal� giri� yapt�n�z. L�tfen bir daha deneyiniz.");
				}
				
		    scan.close();
	
		
	}

}
