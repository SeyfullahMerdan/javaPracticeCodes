package day06_Method_Creation;

import java.util.Scanner;

public class Soru_Bankamatik {

	public static void main(String[] args) {
		
	// bakiye-para çekme-para yatýrma-çýkýþ

		System.out.println("***ATM'ye HoþGeldiniz***");
		
		Scanner scan=new Scanner(System.in);
		
		String islem1="1. Ýþlem: BAKÝYE \n2. Ýþlem: PARA ÇEKME \n3. Ýþlem: PARA YATIRMA \n4. Ýþlem: ÇIKIÞ";
		
		System.out.println(islem1);   // menüyü yazdýrdýk
		
		System.out.println("Yapmak istediginiz iþlemi seçiniz");     /// kullanýcýya bildirim

		int bakiye=5000;
		
		String secilenIslem=scan.nextLine();  // kullanýcýdan iþlem nosu aldýk.2
		
		
		
		switch (secilenIslem) {
		
		case "1":
			System.out.println("bakiyeniz : "+bakiye);
			break;

        case "2":
			System.out.println("Çekeceginiz miktarý giriniz : ");
			int cekilecekMiktar=scan.nextInt();
			if (cekilecekMiktar<=bakiye) {
				bakiye-=cekilecekMiktar;
				System.out.println("Kalan bakiyeniz : " + bakiye);
			} else {
				System.out.println("Hesabýnýzdaki bakiye yetersizdir");
			}
			break;	
			
        case "3":
        	System.out.println("Yatýracagýnýz miktarý giriniz : ");
			int yatýrýlacakMiktar=scan.nextInt();
        	bakiye+=yatýrýlacakMiktar;
        	System.out.println("Yeni bakiyeniz : " + bakiye);
	
	        break;	
			
        case "4":
        	System.out.println("Çýkýþ iþleminiz baþarý ile yapýlmýþtýr");
	        break;
			
		default:
			System.out.println("Hatalý seçim yaptýnýz.");
			break;
		}
			
		
		scan.close();
	}

}
