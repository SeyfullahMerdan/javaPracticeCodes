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
		System.out.println("Lütfen boyunuzu giriniz: ");
		double boy=scan.nextDouble();
	
		System.out.println("Lütfen kilonuzu giriniz: ");
		double kilo=scan.nextDouble();
	
		double BMI= kilo / (boy*boy);
		
		System.out.println(BMI);
		
		if (BMI<=20) {
			System.out.println("Zayýfsýnýz");

		} else if (BMI<25 ) {
			System.out.println("Normal sýnýrlardasýnýz");

		} else if (BMI<30 ) {
			System.out.println("Þiþman kategorisindesiniz");

		} else if (30<BMI) {
			System.out.println("OBEZ grubundasýnýz. ");

		} else {
			System.out.println("Yanlýþ giriþ yaptýnýz. Lütfen pozitif bir sayý giriniz.");
		}
		
		
		scan.close();
	
		
	}

}
