package day10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QMarket {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		* Bir bakkalýn 7 günlük tüm kazançlarýný günlük olarak gösteren bir program yazýnýz.
     * Ayrýca bakkalýn bu hafta ortalama kazandýðý miktarý gösteren bir method yazýnýz.
     * Ayrýca bakkalýn hangi günler ortalamanýn üstüne kazandýðýný gösteren bir method yazýnýz.
     * Ayrýca bakkalýn hangi günler ortalamanýn altýnda kazandýðýný gösteren bir method yazýnýz.
     *
     * 1. Adým : Günleri içeren bir tane ArrayList oluþturun. (gunler)     ****
     * 2. Adým : Günlük kazançlarý ekleyeceðimiz bir tane ArrayList oluþturun. (gunlukKazanclar)
     * 3. Adým : While döngüsü ile kullanýcýdan 7 günlük kazançlarý tekek teker alýp gunlukKazanclar ArrayList'e ekle.
     * 4. Adým : getOrtalamaKazanc() adlý method ile ortalama kazancý alýn.
     * 5. Adým : getOrtalamaninUstundeKazancGünleri() adlý method oluþturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adým : getOrtalamaninAltindaKazancGünleri() adlý method oluþturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
     * 			 ortalama kazançtan aþaðýysa o günleri return yap.
		 * */
		
		
		List <String> gunler=new ArrayList <String>(Arrays.asList("PAZARTESÝ","SALI","ÇARÞAMBA","PERÞEMBE","CUMA","CUMARTESÝ","PAZAR"));
		List <Double> gunlukKazanc=new ArrayList <>();

		
    System.out.println(        "     ********************GÜNLÜK KAZANÇ PROGRAMINA HOÞGELDÝNÝZ********************     "   );
		
		   System.out.println("                 **********ÝÞLEMLERÝNÝZ ARTIK DAHA KOLAY!************             ");
		
		System.out.println("    //// KAZANÇ GÝRÝÞÝ ////\n                         ");
		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		double kazanc=0;       // günlük kazanc alacam
		int gunIndex=0;     // günleri getirmek için, günlerin indexini bulacam
		
        do {
			
        	System.out.println("Lütfen " + gunler.get(gunIndex) + " günü için elde edilen kazancý giriniz: "  );
        	kazanc=scan.nextDouble();
			
			gunlukKazanc.add(kazanc);  // her döngüde sýrasý ile ayný indexe atacak
        	
			gunIndex++;
			
		} while (gunIndex<7);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
