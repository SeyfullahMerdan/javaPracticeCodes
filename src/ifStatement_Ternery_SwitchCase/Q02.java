package ifStatement_Ternery_SwitchCase;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		/*
		 *  Kullanicidan 3 tane pozitif  tam sayi alýniz. 
		 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
		    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
		     
		     Üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farký diger kenardan küçük olmali
			 a+b>c>a-b
			 a+c>b>a-c  
		     b+c>a>b-c  
			a=b=c ise es kenar ucgen   */
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Lütfen üç tane pozitif tam sayý giriniz \nHer sayýdan sonra Enter tuþuna basýnýz.");
			
			double sayi1=scan.nextDouble();
			double sayi2=scan.nextDouble();
			double sayi3=scan.nextDouble();
			
			double a=sayi1;
			double b=sayi2;
			double c=sayi3;
		
			
			if ( (a+b) > c && c>(a-b)  && (a+c)>b &&  b>(a-c) && (b+c)>a && a>(b-c)  ) {
				System.out.println("Bu sayýlarla üçgen oluþturulabilir.");
			} else if ( a==b && a==c && b==c ) {
				System.out.println("Bu sayýlarla eþkenar üçgen oluþturulabilir.");
			} else  {
				System.out.println("Bu sayýlarla üçgen oluþturulamaz.Lütfen baþka sayýlar giriniz");
			}
			
	scan.close();

	}

}
