package ifStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		
		// Kullanicidan  yasini ve kilosunu alaliniz
	    // 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen yaþýnýzý giriniz: ");
		double yas=scan.nextDouble();
	
		System.out.println("Lütfen kilonuzu giriniz: ");
		double kilo=scan.nextDouble();
		
		
		if (yas<18) {
			System.out.println("Üzgünüz. Kan baðýþý yapmak için yaþýnýz küçük.");	
		} else {
			if (yas>18 && kilo>50) {
				System.out.println("Kan bagýþý yapabilirsiniz. Lütfen þubeye geliniz.");
			} else {
				System.out.println("Kan bagýþý yapmak için yeterli þartlarýn hepsi saglanmamýþ.Kilo aldýktan sonra geliniz.");
			}
		}
		

		scan.close();
	
	}

}
