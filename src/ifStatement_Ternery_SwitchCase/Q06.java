package ifStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// Kullanýcýdan aldýgýnýz koordinat noktasýnýn hangi bölgede oldugunu yazdýran bir kod yazýnýz. 
		//  ++   -+  --  +-
		
        @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen koordinatlarý giriniz.\nÝlk sayýdan sonra entera basýp diðer sayýyý giriniz: ");
		double x=scan.nextDouble();
		double y=scan.nextDouble();
		
		
		if (x>0 && y>0) {
			System.out.println("Girilen koordinatlar 1. bölgededir");
		} else if (x<0 && y>0)  {
			System.out.println("Girilen koordinatlar 2. bölgededir");
		} else if (x<0 && y<0)  {
			System.out.println("Girilen koordinatlar 3. bölgededir");
		} else if (x>0 && y<0)  {
			System.out.println("Girilen koordinatlar 4. bölgededir");

		}

		scan.close();
	
	}
}
