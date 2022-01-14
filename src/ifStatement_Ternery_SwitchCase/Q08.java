package ifStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		
		/*
		 * Problem tanimi : 
		 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
		 * musteri karti olup olmadigini sorun
		 
		 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
		 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
		 * alirsa %10 indirim yapin
		 */
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen �r�n adedini giriniz: ");
		double aded=scan.nextDouble();
		
		System.out.println("L�tfen �r�n�n liste fiyat�n� giriniz: ");
		double fiyat=scan.nextDouble();
		
		System.out.println("M��teri kart�n�z var m�? 'Evet' i�in 1 ; 'Hay�r' i�in 2 tu�lay�n. ");
		int secim=scan.nextInt();
		
		
		double toplamTutar=0;

		
		if (secim==1) {
			if (aded>10) {
				fiyat*=0.8;
				toplamTutar= fiyat*aded;
			   System.out.println( "%20 �ndirim!" + toplamTutar  );
			} else {
				fiyat*=0.85;
				toplamTutar= fiyat*aded;
				System.out.println("%15 �ndirim!" + toplamTutar  );
			}	
		} else if (secim==2) {
			if (aded>10) {
				   fiyat*=0.85;
				   toplamTutar= fiyat*aded;
				   System.out.println( "%15 �ndirim.!" + toplamTutar  );
				} else {
					fiyat= fiyat - fiyat*10/100;
					toplamTutar= fiyat*aded;
					System.out.println("%10 �ndirim.!" + toplamTutar  );
				}	
		} else {
			System.out.println("Yanl�� giri� yapt�n�z. L�tfen tekrar deneyiniz.");
		}
		
    scan.close();
	
	}

}
