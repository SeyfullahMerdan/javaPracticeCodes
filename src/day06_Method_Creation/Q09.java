package day06_Method_Creation;

import java.util.Scanner;

public class Q09 {
	/*
	 * Problem Tanýmý: addDigits isminde bir method oluþturun. Parametresi int
	 * Return tipi de int Pozitif int deðerler ver ve en son sonuç tek basamaklý
	 * çýkana kadar basamaklarý birbiriyle topla. Tek basamaklý çýktýðýnda, döndürün
	 * 
	 * Örnek1: Girdi 38 Çýktý: 2 Açýklama: Ýþlemler þöyle olacak: 3 + 8 = 11, 1 + 1
	 * = 2. 2 , tek basamaklý olduðundan, bunu döndürün.
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("bir sayi giriniz : ");
		
		int num=scan.nextInt();
		
		addDigits(num);	

	}

	private static int addDigits(int num) {
		nasil("Method çalýþýyor....");
		
		for (int i = 0; i < 5; i++) {
			num=sum(num);
		
		if (num<10) 
			break;
		}
		return num;
	}
	private static int sum(int num) {
		
		int toplam =0;
		int rakam =0;

		while (num>0) {
			
			rakam = num%10;
			toplam+=rakam;
			num/=10;
		}
		System.out.println("Girdiginiz sayinin rakamlar toplami: "+toplam);
	
		return toplam;
	}
	private static void gozunAydin(String goygoy) {
		System.out.println("çalýþtý:  "+goygoy);
		
	}


	private static void nasil(String mesaj) {
		System.out.println("nasýl methodu calisti:"+mesaj);
		
		gozunAydin("bu method çalýþtý, devam ediyor...");
		
	}

	
	
}