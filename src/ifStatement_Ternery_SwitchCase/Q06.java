package ifStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// Kullan�c�dan ald�g�n�z koordinat noktas�n�n hangi b�lgede oldugunu yazd�ran bir kod yaz�n�z. 
		//  ++   -+  --  +-
		
        @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen koordinatlar� giriniz.\n�lk say�dan sonra entera bas�p di�er say�y� giriniz: ");
		double x=scan.nextDouble();
		double y=scan.nextDouble();
		
		
		if (x>0 && y>0) {
			System.out.println("Girilen koordinatlar 1. b�lgededir");
		} else if (x<0 && y>0)  {
			System.out.println("Girilen koordinatlar 2. b�lgededir");
		} else if (x<0 && y<0)  {
			System.out.println("Girilen koordinatlar 3. b�lgededir");
		} else if (x>0 && y<0)  {
			System.out.println("Girilen koordinatlar 4. b�lgededir");

		}

		scan.close();
	
	}
}
