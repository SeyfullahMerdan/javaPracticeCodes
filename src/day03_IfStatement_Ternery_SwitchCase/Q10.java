package day03_IfStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class Q10 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	      /*
       Kulanýcýdan aracýnýn hýzýný alýnýz
        Trafik cezasýnýn deðerini hesaplayýn.
            45 hýz sýnýrýdýr.
            Eðer hýzýnýz 55-74 arasýnda ise:
            Ceza 100 $'dýr.
            Eðer hýzýnýz 75 - 84 arasýnda ise:
            Ceza 150 $'dýr.
            Eðer hýzýnýz 85 -94 arasýnda ise:
            Ceza 320 $'dýr.
            Eðer hýzýnýz 94'den daha fazla ise:
            Ceza 500 $'dýr.
            ve ayrýca,
            Eðer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
            Örn: Hýzýnýz 77 iken cezanýz 150$'dýr ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            Örn;
            currentSpeed(Hýzýnýz) 87
            ve isDriverLicenceAvailable(Ehliyeti var mý?) = true;
            sonuç 320 olmalýdýr.
            currentSpeed(Hýzýnýz) 65
            ve isDriverLicenceAvailable(Ehliyeti var mý?) = false;
            sonuç 300 olmalýdýr.
   */

		    Scanner scan=new Scanner(System.in);
			
			System.out.println("Please enter your current speed: ");
			double speed=scan.nextDouble();
			
			System.out.println("is driver licence available?\nIf is it not Available please write 'N'\nif it is available write 'Y'");
			char licence=scan.next().toUpperCase().charAt(0);
		
			
			if (licence=='Y') {
				
				if (speed>=55 && speed<=74) {
					System.out.println("Your speed is over the limit. Your penalty amount: 100$");
				} else if (speed>=75 && speed<=84) {
					System.out.println("Your speed is over the limit. Your penalty amount: 150$");
				} else if (speed>=85 && speed<=94) {
					System.out.println("Your speed is over the limit. Your penalty amount: 320$");
				} else if (speed>=95) {
					System.out.println("Your speed is over the limit. Your penalty amount: 500$");
				} else {
					System.out.println(" ***Have a good driving. Everything is alright***");
				}
				
			}
	
			
			if (licence=='N') {

				if (speed>=55 && speed<=74) {
					System.out.println("Your speed is over the limit. Your penalty amount: 300$");
				} else if (speed>=75 && speed<=84) {
					System.out.println("Your speed is over the limit. Your penalty amount: 350$");
				} else if (speed>=85 && speed<=94) {
					System.out.println("Your speed is over the limit. Your penalty amount: 520$");
				} else if (speed>=95) {
					System.out.println("Your speed is over the limit. Your penalty amount: 700$");
				} else {
					System.out.println("Driving without licence is forbidden. Your penalty amount: 200$");
				}	
			}
			
	
  scan.close();
	}

}
