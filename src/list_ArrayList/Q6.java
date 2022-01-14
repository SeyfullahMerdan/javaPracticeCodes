package list_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6 {

	public static void main(String[] args) {
		 /*
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */	
		int arr[]= {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
    	List <Integer> tekrarsz= new ArrayList <>();
		
		for (Integer i : arr) {
			if (  !tekrarsz.contains(i)   ) {
				tekrarsz.add(i);        // Ayný olmayan elemanlarý liste attim.
			}
		}	
		System.out.println(tekrarsz);
		
		int tekrarsizArr[]= new int [   tekrarsz.size()         ];	
		for (int j = 0; j < tekrarsizArr.length; j++) {  // listi arraye çevirdim	
		    tekrarsizArr[j]=tekrarsz.get(j);
		}
			System.out.println(Arrays.toString(tekrarsizArr));
	}

}
