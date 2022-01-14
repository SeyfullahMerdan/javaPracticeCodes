package list_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

	public static void main(String[] args) {
	
		 /*
	   100'den küçük asal sayýlarý yazdýrýnýz.
	   
	     */
		List <Integer> asalSayilar=new ArrayList<>();
		
		int sayi=2;
		int sayac=0;
		
		
		while ( sayi < 100   ) {  // Kendisine bölünebilen sayýlar asal sayýdýr!! O yüzden sadece kendisine bölünecek
			
			// 2 3 4 5 6 7 8 9 ...  
			for (int i = 2; i <= sayi; i++) {
				
				if (sayi%i==0) {    // For ile kendisine bölünebilenleri bulduk
					sayac++;
				}	
			}
			
			
			if (sayac==1) {
					asalSayilar.add(sayi);	  // Kendisine bölündüyse
				}
				
	

			sayi++;
			sayac=0;
			
	}	
		
		System.out.println(asalSayilar);
	}
}