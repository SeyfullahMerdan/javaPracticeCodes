package day06_Method_Creation;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		
		// Girilen bir ay numarasýna göre, ayýn kaç gün oldugunu sayý ile yazdýrýn.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir ay numarasý giriniz.");
		int ayNo=scan.nextInt();
		
		switch (ayNo) {
		case 1:
		case 3:	
		case 5:	
		case 7:	
		case 8:	
		case 10:
		case 12:
			System.out.println("Girdiginiz ay 31 gündür.");
			break;
			
		case 4:
		case 6:	
		case 9:	
		case 11:
			
			System.out.println("Girdiðiniz ay 30 gündür.");
			break;
		case 2:
			System.out.println("Lütfen yýlý da giriniz : ");
			int yil=scan.nextInt();
			if (yil%4==0) {
				System.out.println("Girdiginiz yýl 29 gündür");
			} else {
				System.out.println("Girdiginiz yýl 28 gündür");
			}
			break;
			
		default:
			System.out.println("Hatalý giriþ yaptýnýz. ");

			break;
		}
		
		scan.close();
	}

}
