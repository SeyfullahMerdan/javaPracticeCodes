package ifStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
	
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen boyunuzu giriniz: ");
		double boy=scan.nextDouble();
	
		System.out.println("L�tfen kilonuzu giriniz: ");
		double kilo=scan.nextDouble();
	
		double BMI= kilo / (boy*boy);
		
		System.out.println(BMI);
		
		if (BMI<=20) {
			System.out.println("Zay�fs�n�z");

		} else if (BMI<25 ) {
			System.out.println("Normal s�n�rlardas�n�z");

		} else if (BMI<30 ) {
			System.out.println("�i�man kategorisindesiniz");

		} else if (30<BMI) {
			System.out.println("OBEZ grubundas�n�z. ");

		} else {
			System.out.println("Yanl�� giri� yapt�n�z. L�tfen pozitif bir say� giriniz.");
		}
		
		
		scan.close();
	
		
	}

}
