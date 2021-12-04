package day02_Scanner_IfStatement_MatematikselISlemler;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
	
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Vize sýnav sonucunu giriniz : ");
		double vize=scan.nextDouble();
		
		System.out.println("Vize sýnav yüzdesini giriniz : ");
		double vizeOrtalama=scan.nextDouble();
		
		
		
		System.out.println("Final sýnav sonucunu giriniz : ");
		double fnl=scan.nextDouble();
		
		System.out.println("Final sýnav yüzdesini giriniz : ");
		double finalOrtalama=scan.nextDouble();
		
		
		double ortalama=(vize*vizeOrtalama/100)+(fnl*finalOrtalama/100);
		
		
		System.out.println("Ortalamanýz : " + ortalama );
		
		
		if (ortalama>=90) {
			System.out.println("Notunuz: AA");
		} 
		else if (ortalama>=80) {
			System.out.println("Notunuz: BA");
		}
		else if (ortalama>=70) {
			System.out.println("Notunuz: BB");
		}
		else if (ortalama>=60) {
			System.out.println("Notunuz: CB");
		}
		else if (ortalama>=50) {
			System.out.println("Notunuz: CC");
		}
		
		else if (ortalama>=40) {
			System.out.println("Notunuz: DC");
		}
		
		else if (ortalama>=30) {
			System.out.println("Notunuz: DD");
		}
		
		else {
			System.out.println("NE ETTÝN BEA YAH NOTUN:FF");
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
