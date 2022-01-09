package day04_05_StringManipulations;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*

         * Kullanýcýdan aldýgýnýz  Adý, Soyadý ve kredi kartý numaralarýný aþagýdaki gibi özel forma dönüþtürün
         * Kredi kartý numarasýný kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartý numarasý" yazdýrýn.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adýn baþ harfleri ve soyadý büyük olmalýdýr)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
       
    	
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Lütfen adýnýzý soyadýnýzý ve 16 haneli kredi kartý numaranýzý giriniz. \nArdýndan Enter tuþuna basýnýz..");
    	String ad=scan.nextLine().toUpperCase();
    	String soyad=scan.nextLine().toUpperCase();
    	String kk=scan.nextLine();
    	
    	System.out.println("Adýnýz : " +ad.substring(0,1)+ad.substring(1).replaceAll("\\w","*"));
    	System.out.println("Soyadýnýz : " +soyad.substring(0,1)+soyad.substring(1).replaceAll("\\w","*"));
    	
    	if ( kk.length()<16 || kk.length()>16  ) {
			System.out.println("Geçersiz bir kredi kartý numarasý girdiniz. Tekrar giriniz.");
		} else {
			System.out.println("Kredi Kartý Numaranýz : "+kk.substring(0, 4).replaceAll("\\d","*")+ " " +kk.substring(4, 8).replaceAll("\\d","*")  
					
					 +" " +kk.substring(8, 12).replaceAll("\\d","*")+" "+kk.substring(12) );
		}
    	
    	scan.close();
    	
    	

    }
}
