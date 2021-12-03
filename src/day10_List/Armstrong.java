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
	    System.out.println("Sayýnýn Armstrong olup olmadýgýný görmek için lütfen bir sayý giriniz : ");
		int sayi=scan.nextInt();    // Orjinal sayýmý if de kullanmak için tutuyorum.
	
		int sayiIslemeSokulan=sayi;    // Ýþleme soktuktan sonra 0 olacagý için orjinal sayýmý bu variable a da atýyorum.
		int rakam=0;         // rakamlarý parçalayacagým, bu konteynýra koyacagým
		int rakamlarKupu=1;   // rakamlarküpünü bu konteynýra koyacagým
		int kuplerToplam=0;    // rakamlar küpünü topladýka içine atacam
		            
	
       do {
			rakam=sayiIslemeSokulan%10;        // rakamlarýný topladým
			
			rakamlarKupu=(rakam*rakam*rakam) ;  // rakamlarý çarpýmýný aldým
			
			kuplerToplam+=rakamlarKupu;   // rakamlarýn küpünü toplama  attým.
			
			sayiIslemeSokulan/=10;     // sayýyý 10'a bölerek küçülttüm ve bir sonraki basamkta sayýmýn son basamagý olmaycak
	
       } while (sayiIslemeSokulan!=0);     
				
		System.out.println(kuplerToplam);
		
	       if (kuplerToplam==sayi) {
		       System.out.println("Girdiginiz " + sayi + " Armstrong bir sayýdýr. ");
	         } else {
		       System.out.println("Girdiginiz " + sayi + " Armstrong bir sayý deðildir ");  } 

	}
}
