package day03_IfStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class Q10 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	      /*
       Kulan�c�dan arac�n�n h�z�n� al�n�z
        Trafik cezas�n�n de�erini hesaplay�n.
            45 h�z s�n�r�d�r.
            E�er h�z�n�z 55-74 aras�nda ise:
            Ceza 100 $'d�r.
            E�er h�z�n�z 75 - 84 aras�nda ise:
            Ceza 150 $'d�r.
            E�er h�z�n�z 85 -94 aras�nda ise:
            Ceza 320 $'d�r.
            E�er h�z�n�z 94'den daha fazla ise:
            Ceza 500 $'d�r.
            ve ayr�ca,
            E�er s�r�c�n�n ehliyeti yoksa cezaya 200 $ eklenir.
            �rn: H�z�n�z 77 iken cezan�z 150$'d�r ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            �rn;
            currentSpeed(H�z�n�z) 87
            ve isDriverLicenceAvailable(Ehliyeti var m�?) = true;
            sonu� 320 olmal�d�r.
            currentSpeed(H�z�n�z) 65
            ve isDriverLicenceAvailable(Ehliyeti var m�?) = false;
            sonu� 300 olmal�d�r.
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
