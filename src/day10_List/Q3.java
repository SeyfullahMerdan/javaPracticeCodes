package day10_List;

import java.util.ArrayList;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		
	    	List <Integer> list=new ArrayList<>();
	    	list.add(2);   // 4
	    	list.add(5);   // 25
	    	list.add(10);  // 100
	    	list.add(3);   // 9
	    	list.add(20);  // 400
	    	
	    	System.out.println(list);
	    	
	    	int toplam=0;

	    	
	    	for (Integer sayi : list) {
			     
	    		toplam+= sayi*sayi;
	    		
			}
	    	
	    	System.out.println(toplam);
	
	    }
	}
