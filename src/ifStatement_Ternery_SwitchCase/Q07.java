package ifStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		 
        Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen bir harf veya karakter giriniz: ");
		char krk=scan.next().charAt(0);
		
		if (krk>='A' && krk<'Z') {
			System.out.println("B�Y�K");
		} else if (krk>='a' && krk<'z') {
			System.out.println("K���K");
		} else if (krk<'A') {
			System.out.println("KARAKTER");
		} // else {
	//		System.out.println("KARAKTER DI�I. Yanl�� Giri� Yapt�n�z."); }
	
		scan.close();
	}

}
