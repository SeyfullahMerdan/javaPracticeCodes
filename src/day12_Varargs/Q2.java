package day12_Varargs;

public class Q2 {

	public static void main(String[] args) {
		
		 // verilen int lerden ilki haric tum sayilari toplayan ve
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.



islem ( 5, 10, 20,3,2,5 );


}

	
	
   public static void islem ( int sayi1, int...sayi2 ) {


      int toplam=0;
      for (int i : sayi2) {
           toplam+=i;
               }
    
      System.out.println(toplam*sayi1);
}

	
		
	}

