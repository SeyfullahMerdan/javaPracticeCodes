package day03_IfStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class NotHesaplama {

	public static void main(String[] args) {

		/*
        1. Kullan�c� vize s�nav notunu girsin
        2. vize notu double olacak
        3. vize snav y�zdesini girin. double olmal�. y�zde 40 etkilesin  y�zde ka� etkiledigini sisteme siz giriyorsunuz.
        4. kullan�c� final s�nav sonucunu girsin
        5.final notu double degerinde olmal�. 
        6. final s�nav� y�zdesini girsin. double ollmal�. y�zde 60 etkiliyor.
        7. vize fnal ortalamas� bulmak i�in, vizenin y�zde40'�, finalin 60'� al�nmal� ve al�nan sonu�lar toplanmal�d�r
        8. Al�nan sonucu (dersin not ortalamas�n�)   double toplama e�itleyelim.

            Ko�ul katman�
            
 			eger ortalamasi 90(90 dahil) 'dan b�y�k ise, harf notu olarak 
 			AA, 80(80dahil)   ile 90 aras�nda ise  
 			BA, 70(70 dahil)   ile 80 aras�nda ise 
 			BB, 60(60dahil) ile 70 aras��nda ise 
 			CB, 50(50 dahil) ile 60 aras�nda ise 
 			CC, 40(40 dahil) ile 50 aras�nda ise 
 			DC, 30(30 dahil) ile 40 aras�nda ise 
 			DD, 30 'dan d���k ise FF  gelmeli.
 			
         */
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Vize s�nav sonucunuzu giriniz: ");
    	double vizes=scan.nextDouble();
    	
    	System.out.println("Final s�nav sonucunuzu giriniz: ");
    	double finals=scan.nextDouble();
    	
    	
    	
    	double vizeYuzde=0.40;
    	double finalYuzde=0.60;
    	
    	
    	
    	double toplam= (vizes*vizeYuzde) + (finals*finalYuzde);
    	
    	
    	
    	System.out.println(toplam);
    	
    	if (toplam>100) {
			System.out.println("Ge�ersiz not girdiniz. \nL�tfen ge�erli bir not giriniz. ");
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
