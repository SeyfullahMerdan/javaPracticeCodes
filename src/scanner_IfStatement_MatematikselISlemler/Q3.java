package scanner_IfStatement_MatematikselISlemler;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		/*
		 Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz        // Vucüy kýtle endeksi

		BMI = kilo(kg) /(boy/100*boy/100)(cm)
		BMI <=20 oldukca zayifsiniz 
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen boyunuzu giriniz. ");
		double boy=scan.nextDouble();
		
		System.out.println("Lütfen kilonuzu giriniz. ");
		double kilo=scan.nextDouble();
		
		
		double vki=kilo/(boy/100*boy/100);
		
		// System.out.println(VKE);
		
		if (vki<=20) {
			System.out.println("Zayýfsýnýz");
		}
		else if (vki<=25) { 
			
			System.out.println("Normalsiniz");
		}
		
        else if (vki<=30) { 
			
			System.out.println("Þiþmansýnnnn");
		}
		
        else if (vki>31) { 
			
			System.out.println("Naptýn Hacýýý");
		}
		
       scan.close();
	
	}

}
