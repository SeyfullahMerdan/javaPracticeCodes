package stringManipulations;

import java.util.Scanner;

public class Q01 {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        // Kullan�c�dan alacag�n�z bir stringde bo�luk karakterinin olup olmad�g�n� kontrol ediniz.
        
    	
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("L�tfen bir String ifade giriniz: ");
    	String string=scanner.nextLine();
    	
    	boolean varMi=string.contains(" ");
        
    	System.out.println("Girilen Stringde bo�luk vard�r:\n" + varMi);
    
    	
    	// Kullan�c�dan alacag�n�z bir stringin bos olup olmad�g�n� kontrol ediniz.
    	
         
    	System.out.println("Girilen String bo�tur:\n" + string.isEmpty());
    	
    	
    	
    	
    	
    	
    }
}

