package list_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {

	 @SuppressWarnings("resource")
		public static void main(String[] args) {
		       
		 // Bir öðretmenden girmek istediði kadar notu alýnýz, ve
		        // ortalamayý geçen öðrenci sayýsýný bulunuz.
		      
		 List<Integer> listNotlar = new ArrayList<>();
		 Scanner scan = new Scanner(System.in);
		 String dewam;
		       
		        
		        do {
		            System.out.print("not giriniz : ");
		            int ogrNot= scan.nextInt();
		            System.out.println("dewamkeee : E/H");
		            dewam= scan.next();
		            listNotlar.add(ogrNot);
		        }while (dewam.equalsIgnoreCase("E"));

		       
		        
		        int toplam=0;
		        for (int i = 0; i <listNotlar.size(); i++){
		            toplam+=listNotlar.get(i);
		        }
		        double ortalama=toplam/listNotlar.size();
		      
		        
		        
		        
		        int ortlamaGecenSayisi=0;
		        for (int i = 0; i < listNotlar.size(); i++) {
		            if (listNotlar.get(i)>ortalama){
		                ortlamaGecenSayisi++;
		            }
		        }
		        
		        
		        System.out.println("girilen notlarin ortaqlamasi  :"+ortalama);
		        
		        System.out.println("ortalama gecen ogr sayisi : "+ortlamaGecenSayisi);
		   
	 }
		}
