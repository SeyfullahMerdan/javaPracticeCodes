package ifStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		/*
		 *  Kullanicidan 3 tane pozitif  tam sayi al�niz. 
		 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
		    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
		     
		     ��gen olma sarti :herhangi iki kenar toplami diger kenardan b�y�k, herhangi iki kenar fark� diger kenardan k���k olmali
			 a+b>c>a-b
			 a+c>b>a-c  
		     b+c>a>b-c  
			a=b=c ise es kenar ucgen   */
		
			Scanner scan=new Scanner(System.in);
			System.out.println("L�tfen �� tane pozitif tam say� giriniz \nHer say�dan sonra Enter tu�una bas�n�z.");
			
			double sayi1=scan.nextDouble();
			double sayi2=scan.nextDouble();
			double sayi3=scan.nextDouble();
			
			double a=sayi1;
			double b=sayi2;
			double c=sayi3;
		
			
			if ( (a+b) > c && c>(a-b)  && (a+c)>b &&  b>(a-c) && (b+c)>a && a>(b-c)  ) {
				System.out.println("Bu say�larla ��gen olu�turulabilir.");
			} else if ( a==b && a==c && b==c ) {
				System.out.println("Bu say�larla e�kenar ��gen olu�turulabilir.");
			} else  {
				System.out.println("Bu say�larla ��gen olu�turulamaz.L�tfen ba�ka say�lar giriniz");
			}
			
	scan.close();

	}

}
