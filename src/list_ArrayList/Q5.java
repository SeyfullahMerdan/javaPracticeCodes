package list_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Kullan�c�dan al�nan 6 dizeli bir eleman�n
        // sadece tek elemanlar�n� ayr� bir diziye bir methodda atayan
        // main de yazd�r�n�z.

    	Scanner scan=new Scanner(System.in);
    	List <Integer>list=new ArrayList<>();
    	List <Integer>listTekli=new ArrayList<>();
    	
    	
    	do {
			System.out.println("L�tfen liste eklemek i�in bir say� giriniz.");
    		list.add(scan.nextInt());

		} while (list.size()<6 );
    	
    	System.out.println(list);
    	
     /* for (Integer i : list) {
	      
    	  if (i%2==1) {
		  listTekli.add(i);
		}  
	}
    	
    	System.out.println(listTekli);
    	 */
    	
    	
    	for (int i = 0; i < list.size(); i+=2) {
		      
    		listTekli.add( list.get(i) );
    		
		}
    	
    	System.out.println(listTekli);
    	
    	

    }


}
