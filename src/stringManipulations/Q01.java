package stringManipulations;

import java.util.Scanner;

public class Q01 {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        // Kullanýcýdan alacagýnýz bir stringde boþluk karakterinin olup olmadýgýný kontrol ediniz.
        
    	
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Lütfen bir String ifade giriniz: ");
    	String string=scanner.nextLine();
    	
    	boolean varMi=string.contains(" ");
        
    	System.out.println("Girilen Stringde boþluk vardýr:\n" + varMi);
    
    	
    	// Kullanýcýdan alacagýnýz bir stringin bos olup olmadýgýný kontrol ediniz.
    	
         
    	System.out.println("Girilen String boþtur:\n" + string.isEmpty());
    	
    	
    	
    	
    	
    	
    }
}

