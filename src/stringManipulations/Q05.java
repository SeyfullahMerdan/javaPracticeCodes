package stringManipulations;

public class Q05 {
    public static void main(String[] args) {
    /*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2=  %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */

    	String str1= "%13.99" ;
    	String str2= "%10.55" ;
    	
    	str1=str1.replaceAll("%"," " );
    	str2=str2.replace("%", " ");
    	
    	System.out.println(str1  + str2);
    	
    	double str3= Double.parseDouble(str1)+Double.parseDouble(str2);
    	
    	System.out.println(str3);

    	
    	
    	
      
    }
}
