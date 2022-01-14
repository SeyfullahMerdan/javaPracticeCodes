package forLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        // Kullan�c�dan 5 adet say� isteyiniz
        // Bu say�lardan 5 ile 10 aras�ndakiler hari�, digerlerinin toplam�n� bulunuz.
        // bu soruyu continue kullanarak ��z�n�z.

        
    	Scanner scan = new Scanner(System.in);
        
    	int sayiToplam=0;
    	
    	for (int i = 1; i < 6 ; i++) {
			
    		System.out.println("L�tfen " + i + ". say�y� giriniz");
    		
    		int sayi=scan.nextInt();
    		
    		
    		if (sayi>5 && sayi<10) {
				System.out.println("Girilen say� 5 ile 10 aras� oldugu i�in i�leme al�nmad�");
				continue;      // yok sayar. pas ge�er. kodu durdurmaz...
			}
    		
    		sayiToplam+=sayi;
		}
    	
    	System.out.println("Girdiginiz say�lar�n toplam� : "+sayiToplam);
    	
 
    	
    	scan.close();
    	
    }

}
