package day06_Method_Creation;

import java.util.Scanner;

public class Soru_Bankamatik {

	public static void main(String[] args) {
		
	// bakiye-para �ekme-para yat�rma-��k��

		System.out.println("***ATM'ye Ho�Geldiniz***");
		
		Scanner scan=new Scanner(System.in);
		
		String islem1="1. ��lem: BAK�YE \n2. ��lem: PARA �EKME \n3. ��lem: PARA YATIRMA \n4. ��lem: �IKI�";
		
		System.out.println(islem1);   // men�y� yazd�rd�k
		
		System.out.println("Yapmak istediginiz i�lemi se�iniz");     /// kullan�c�ya bildirim

		int bakiye=5000;
		
		String secilenIslem=scan.nextLine();  // kullan�c�dan i�lem nosu ald�k.2
		
		
		
		switch (secilenIslem) {
		
		case "1":
			System.out.println("bakiyeniz : "+bakiye);
			break;

        case "2":
			System.out.println("�ekeceginiz miktar� giriniz : ");
			int cekilecekMiktar=scan.nextInt();
			if (cekilecekMiktar<=bakiye) {
				bakiye-=cekilecekMiktar;
				System.out.println("Kalan bakiyeniz : " + bakiye);
			} else {
				System.out.println("Hesab�n�zdaki bakiye yetersizdir");
			}
			break;	
			
        case "3":
        	System.out.println("Yat�racag�n�z miktar� giriniz : ");
			int yat�r�lacakMiktar=scan.nextInt();
        	bakiye+=yat�r�lacakMiktar;
        	System.out.println("Yeni bakiyeniz : " + bakiye);
	
	        break;	
			
        case "4":
        	System.out.println("��k�� i�leminiz ba�ar� ile yap�lm��t�r");
	        break;
			
		default:
			System.out.println("Hatal� se�im yapt�n�z.");
			break;
		}
			
		
		scan.close();
	}

}
