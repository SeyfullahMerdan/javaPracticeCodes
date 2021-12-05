package day03_IfStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class NotHesaplama {

	public static void main(String[] args) {

		/*
        1. Kullanýcý vize sýnav notunu girsin
        2. vize notu double olacak
        3. vize snav yüzdesini girin. double olmalý. yüzde 40 etkilesin  yüzde kaç etkiledigini sisteme siz giriyorsunuz.
        4. kullanýcý final sýnav sonucunu girsin
        5.final notu double degerinde olmalý. 
        6. final sýnavý yüzdesini girsin. double ollmalý. yüzde 60 etkiliyor.
        7. vize fnal ortalamasý bulmak için, vizenin yüzde40'ý, finalin 60'ý alýnmalý ve alýnan sonuçlar toplanmalýdýr
        8. Alýnan sonucu (dersin not ortalamasýný)   double toplama eþitleyelim.

            Koþul katmaný
            
 			eger ortalamasi 90(90 dahil) 'dan büyük ise, harf notu olarak 
 			AA, 80(80dahil)   ile 90 arasýnda ise  
 			BA, 70(70 dahil)   ile 80 arasýnda ise 
 			BB, 60(60dahil) ile 70 arasý±nda ise 
 			CB, 50(50 dahil) ile 60 arasýnda ise 
 			CC, 40(40 dahil) ile 50 arasýnda ise 
 			DC, 30(30 dahil) ile 40 arasýnda ise 
 			DD, 30 'dan düþük ise FF  gelmeli.
 			
         */
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Vize sýnav sonucunuzu giriniz: ");
    	double vizes=scan.nextDouble();
    	
    	System.out.println("Final sýnav sonucunuzu giriniz: ");
    	double finals=scan.nextDouble();
    	
    	
    	
    	double vizeYuzde=0.40;
    	double finalYuzde=0.60;
    	
    	
    	
    	double toplam= (vizes*vizeYuzde) + (finals*finalYuzde);
    	
    	
    	
    	System.out.println(toplam);
    	
    	if (toplam>100) {
			System.out.println("Geçersiz not girdiniz. \nLütfen geçerli bir not giriniz. ");
		} else if ( toplam>=90 ) {
			System.out.println(" Notunuz : AA");
		} else if ( toplam>=80 ) {
			System.out.println(" Notunuz : BA");
		} else if ( toplam>=70 ) {
			System.out.println(" Notunuz : BB");
		} else if ( toplam>=60 ) {
			System.out.println(" Notunuz : CB");
		} else if ( toplam>=50 ) {
			System.out.println(" Notunuz : CC");
		} else if ( toplam>=40 ) {
			System.out.println(" Notunuz : DC");
		} else if ( toplam>=30 ) {
			System.out.println(" Notunuz : DD");
		} else {
			System.out.println(" Notunuz : FF");
		} 
    	
    	
    	scan.close();
    	
 

	}

}
