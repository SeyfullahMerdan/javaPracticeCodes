package ifStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		
		// Kullanicidan  yasini ve kilosunu alaliniz
	    // 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen ya��n�z� giriniz: ");
		double yas=scan.nextDouble();
	
		System.out.println("L�tfen kilonuzu giriniz: ");
		double kilo=scan.nextDouble();
		
		
		if (yas<18) {
			System.out.println("�zg�n�z. Kan ba���� yapmak i�in ya��n�z k���k.");	
		} else {
			if (yas>18 && kilo>50) {
				System.out.println("Kan bag��� yapabilirsiniz. L�tfen �ubeye geliniz.");
			} else {
				System.out.println("Kan bag��� yapmak i�in yeterli �artlar�n hepsi saglanmam��.Kilo ald�ktan sonra geliniz.");
			}
		}
		

		scan.close();
	
	}

}
