package day10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {

	 @SuppressWarnings("unused")
		public static void main(String[] args) {
	        /*
	         * Input olarak verilen listteki isimlerden
	         * icinde a harfi bulunanlari silen bir program yaziniz
	         *
	         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
	         * OUTPUT : [Veli,Omer]
	         */


	    	/* List <String> list1= new ArrayList <>();
	    	
	    	list1.add("Ali");
	    	list1.add("Veli");
	    	list1.add("Ayse");
	    	list1.add("Fatma");
	    	list1.add("Omer");     */
	    	
	    	// Silme ekleme olmuyor, Array davranýþý***
	    	List <String> list1= new ArrayList <>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer")); // Array davranýþý gösterir. Baþta deklere ettim.
	    	List <String> list2= new ArrayList <>(); // Boþ konteynir aldým, içine atacam

	    	
	    	for (String each : list1) {
	    		
	    		if ( each.toLowerCase().contains("a") ) {
	    			continue;

				} else list2.add(each);  }
	        System.out.println(list2);
	    }
	    
	}

