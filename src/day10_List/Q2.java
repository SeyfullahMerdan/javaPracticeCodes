package day10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		
		
	     //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
	     //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
	 
	    	String isim[][] = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
	        
	  
	   
	       List<String> list1 = new ArrayList<>();
	       
	       for (int kat = 0; kat < isim.length; kat++) {//kat kontrolu
	            for (int daire = 0; daire < isim[kat].length; daire++) {//dire kontrolu
	                list1.add(isim[kat][daire]);//girilen karin dairesi list  eklendi
	            }
	            
	        }
	        System.out.println("ilk liste :" + list1);
	        Collections.sort(list1);
	        System.out.println("siralamadan sonraki liste :" + list1);
	    	

	    }

	    
	}

		
		
		