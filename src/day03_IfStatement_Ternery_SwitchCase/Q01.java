package day03_IfStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen iki sayý giriniz \nArdýndan Enter tuþuna basýnýz.");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("Toplama için 1 tuþuna basýp Enter tuþuna basýn");
		System.out.println("Çýkarma için 2 tuþuna basýp Enter tuþuna basýn");
		System.out.println("Çarpma için 3 tuþuna basýp Enter tuþuna basýn");
		System.out.println("Bölme için 4 tuþuna basýp Enter tuþuna basýn");
		
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
			System.out.println("Geçersiz giriþ yaptýnýz. Lütfen tekrar deneyiniz.");
		}
		
		scan.close();
			

	}

}
