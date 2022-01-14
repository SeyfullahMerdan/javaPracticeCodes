package scanner_IfStatement_MatematikselISlemler;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		// Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
				//  dort islemden biri ile isleme koyup sonucun yazdiriniz.
				
				
				Scanner scan=new Scanner (System.in);
				System.out.println("Lütfen iki sayi giriniz : ");
				double sayi1=scan.nextDouble();
				double sayi2=scan.nextDouble();
				
				System.out.println("toplama için 1 \nçýkarma için 2 \nçarpma için 3 \nbölme için 4 ");   // \n alt alta yazdýrýr....
				
				int islem=scan.nextInt();
				
				if (islem==1) {
					System.out.println("girdiginiz sayilarin toplamý : "+(sayi1+sayi2));
				}
				
				else if (islem==2 ) { 
					System.out.println("girdiginiz sayilarin farki : "+(sayi1-sayi2));
					
				}
				
				else if (islem==3 ) { 
					System.out.println("girdiginiz sayilarin çarpýmý : "+(sayi1*sayi2));
					
				}
				
				else if (islem==4 ) { 
					System.out.println("girdiginiz sayilarin farki : "+(sayi1/sayi2));
					
				}
				
				else {
					System.out.println("Hatalý giriþ yaptýnýz. Lütfen bir daha deneyiniz.");
				}
				
		    scan.close();
	
		
	}

}
