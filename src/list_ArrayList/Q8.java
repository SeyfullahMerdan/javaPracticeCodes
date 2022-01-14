package list_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Q8 {

	public static void main(String[] args) {
	
		  /*
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

    	
    List <String> isimler= new ArrayList <String> (List.of("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
    String str="";
    	
    System.out.println(isimler);
    
     str=isimler.get(2);
    
    System.out.println(str);  // Kemali koydum
    
    isimler.set(2, isimler.get(7));
    System.out.println(isimler);  // Furkaný 3. sýraya aldým
    
    isimler.set(7, str);
    
    System.out.println(isimler);

		
		
		
		
		
		
		
		
	}

}
