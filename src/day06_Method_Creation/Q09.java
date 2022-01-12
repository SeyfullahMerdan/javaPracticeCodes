package day06_Method_Creation;

import java.util.Scanner;

public class Q09 {
	/*
	 * Problem Tan�m�: addDigits isminde bir method olu�turun. Parametresi int
	 * Return tipi de int Pozitif int de�erler ver ve en son sonu� tek basamakl�
	 * ��kana kadar basamaklar� birbiriyle topla. Tek basamakl� ��kt���nda, d�nd�r�n
	 * 
	 * �rnek1: Girdi 38 ��kt�: 2 A��klama: ��lemler ��yle olacak: 3 + 8 = 11, 1 + 1
	 * = 2. 2 , tek basamakl� oldu�undan, bunu d�nd�r�n.
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("bir sayi giriniz : ");
		
		int num=scan.nextInt();
		
		addDigits(num);	

	}

	private static int addDigits(int num) {
		nasil("Method �al���yor....");
		
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
		System.out.println("�al��t�:  "+goygoy);
		
	}


	private static void nasil(String mesaj) {
		System.out.println("nas�l methodu calisti:"+mesaj);
		
		gozunAydin("bu method �al��t�, devam ediyor...");
		
	}

	
	
}