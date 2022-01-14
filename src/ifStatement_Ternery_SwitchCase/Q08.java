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
		
		System.out.println("Lütfen ürün adedini giriniz: ");
		double aded=scan.nextDouble();
		
		System.out.println("Lütfen ürünün liste fiyatýný giriniz: ");
		double fiyat=scan.nextDouble();
		
		System.out.println("Müþteri kartýnýz var mý? 'Evet' için 1 ; 'Hayýr' için 2 tuþlayýn. ");
		int secim=scan.nextInt();
		
		
		double toplamTutar=0;

		
		if (secim==1) {
			if (aded>10) {
				fiyat*=0.8;
				toplamTutar= fiyat*aded;
			   System.out.println( "%20 Ýndirim!" + toplamTutar  );
			} else {
				fiyat*=0.85;
				toplamTutar= fiyat*aded;
				System.out.println("%15 Ýndirim!" + toplamTutar  );
			}	
		} else if (secim==2) {
			if (aded>10) {
				   fiyat*=0.85;
				   toplamTutar= fiyat*aded;
				   System.out.println( "%15 Ýndirim.!" + toplamTutar  );
				} else {
					fiyat= fiyat - fiyat*10/100;
					toplamTutar= fiyat*aded;
					System.out.println("%10 Ýndirim.!" + toplamTutar  );
				}	
		} else {
			System.out.println("Yanlýþ giriþ yaptýnýz. Lütfen tekrar deneyiniz.");
		}
		
    scan.close();
	
	}

}
