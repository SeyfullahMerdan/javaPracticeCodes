package list_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

	public static void main(String[] args) {
	
		 /*
	   100'den k���k asal say�lar� yazd�r�n�z.
	   
	     */
		List <Integer> asalSayilar=new ArrayList<>();
		
		int sayi=2;
		int sayac=0;
		
		
		while ( sayi < 100   ) {  // Kendisine b�l�nebilen say�lar asal say�d�r!! O y�zden sadece kendisine b�l�necek
			
			// 2 3 4 5 6 7 8 9 ...  
			for (int i = 2; i <= sayi; i++) {
				
				if (sayi%i==0) {    // For ile kendisine b�l�nebilenleri bulduk
					sayac++;
				}	
			}
			
			
			if (sayac==1) {
					asalSayilar.add(sayi);	  // Kendisine b�l�nd�yse
				}
				
	

			sayi++;
			sayac=0;
			
	}	
		
		System.out.println(asalSayilar);
	}
}