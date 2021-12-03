package day10_List;

import java.util.Scanner;

public class Armstrong {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/* Check if the integer is an Armstrong numbers
	       Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir

	         153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
	         370 = 3*3*3 + 7*7*7 + 0*0*0 = 370   */
		
		Scanner scan=new Scanner(System.in);
	    System.out.println("Say�n�n Armstrong olup olmad�g�n� g�rmek i�in l�tfen bir say� giriniz : ");
		int sayi=scan.nextInt();    // Orjinal say�m� if de kullanmak i�in tutuyorum.
	
		int sayiIslemeSokulan=sayi;    // ��leme soktuktan sonra 0 olacag� i�in orjinal say�m� bu variable a da at�yorum.
		int rakam=0;         // rakamlar� par�alayacag�m, bu konteyn�ra koyacag�m
		int rakamlarKupu=1;   // rakamlark�p�n� bu konteyn�ra koyacag�m
		int kuplerToplam=0;    // rakamlar k�p�n� toplad�ka i�ine atacam
		            
	
       do {
			rakam=sayiIslemeSokulan%10;        // rakamlar�n� toplad�m
			
			rakamlarKupu=(rakam*rakam*rakam) ;  // rakamlar� �arp�m�n� ald�m
			
			kuplerToplam+=rakamlarKupu;   // rakamlar�n k�p�n� toplama  att�m.
			
			sayiIslemeSokulan/=10;     // say�y� 10'a b�lerek k���ltt�m ve bir sonraki basamkta say�m�n son basamag� olmaycak
	
       } while (sayiIslemeSokulan!=0);     
				
		System.out.println(kuplerToplam);
		
	       if (kuplerToplam==sayi) {
		       System.out.println("Girdiginiz " + sayi + " Armstrong bir say�d�r. ");
	         } else {
		       System.out.println("Girdiginiz " + sayi + " Armstrong bir say� de�ildir ");  } 

	}
}
