package day03_IfStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen iki say� giriniz \nArd�ndan Enter tu�una bas�n�z.");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("Toplama i�in 1 tu�una bas�p Enter tu�una bas�n");
		System.out.println("��karma i�in 2 tu�una bas�p Enter tu�una bas�n");
		System.out.println("�arpma i�in 3 tu�una bas�p Enter tu�una bas�n");
		System.out.println("B�lme i�in 4 tu�una bas�p Enter tu�una bas�n");
		
		int tus=scan.nextInt();
	
		
		if (tus==1) {
			System.out.println(sayi1+sayi2);	
		} else if (tus==2) {
			if (sayi2>sayi1  ) {
			System.out.println(sayi2-sayi1);
			} else {
			System.out.println(sayi1-sayi2);
			}
		} else if (tus==3) {
			System.out.println(sayi1*sayi2);
		} else if (tus==4) {
			System.out.println(sayi1/sayi2);
		} else {
			System.out.println("Ge�ersiz giri� yapt�n�z. L�tfen tekrar deneyiniz.");
		}
		
		scan.close();
			

	}

}
