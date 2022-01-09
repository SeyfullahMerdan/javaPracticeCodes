package day04_05_StringManipulations;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*

         * Kullan�c�dan ald�g�n�z  Ad�, Soyad� ve kredi kart� numaralar�n� a�ag�daki gibi �zel forma d�n��t�r�n
         * Kredi kart� numaras�n� kontrol edin, yoksa 16 haneden k���k olursa   "Ge�ersiz kredi kart� numaras�" yazd�r�n.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Ad�n ba� harfleri ve soyad� b�y�k olmal�d�r)
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
    	System.out.println("L�tfen ad�n�z� soyad�n�z� ve 16 haneli kredi kart� numaran�z� giriniz. \nArd�ndan Enter tu�una bas�n�z..");
    	String ad=scan.nextLine().toUpperCase();
    	String soyad=scan.nextLine().toUpperCase();
    	String kk=scan.nextLine();
    	
    	System.out.println("Ad�n�z : " +ad.substring(0,1)+ad.substring(1).replaceAll("\\w","*"));
    	System.out.println("Soyad�n�z : " +soyad.substring(0,1)+soyad.substring(1).replaceAll("\\w","*"));
    	
    	if ( kk.length()<16 || kk.length()>16  ) {
			System.out.println("Ge�ersiz bir kredi kart� numaras� girdiniz. Tekrar giriniz.");
		} else {
			System.out.println("Kredi Kart� Numaran�z : "+kk.substring(0, 4).replaceAll("\\d","*")+ " " +kk.substring(4, 8).replaceAll("\\d","*")  
					
					 +" " +kk.substring(8, 12).replaceAll("\\d","*")+" "+kk.substring(12) );
		}
    	
    	scan.close();
    	
    	

    }
}
