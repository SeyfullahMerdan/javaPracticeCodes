package method_Creation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Lütfen String bir ifade giriniz: ");
    	String str=scan.nextLine().trim().toLowerCase();
    	
    	
    	
    	dizim(str);
    	
    	System.out.println("Girilen ifade de düzenli bir xyz dizimi var: " + dizim(str));
    	
    	scan.close(); 	
    	
    }


    
    public static boolean dizim(String str) {
	
      boolean varMi = false;
    	
       String dizim="xyz";
    
        if (str.contains(dizim)) {
		   varMi=true;
	         }  else {
		    varMi=false;
	                      }
       
    

		return varMi;
	}

	
	
	

    }
