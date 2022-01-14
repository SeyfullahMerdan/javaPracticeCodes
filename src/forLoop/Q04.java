package forLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        // Kullanýcýdan 5 adet sayý isteyiniz
        // Bu sayýlardan 5 ile 10 arasýndakiler hariç, digerlerinin toplamýný bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        
    	Scanner scan = new Scanner(System.in);
        
    	int sayiToplam=0;
    	
    	for (int i = 1; i < 6 ; i++) {
			
    		System.out.println("Lütfen " + i + ". sayýyý giriniz");
    		
    		int sayi=scan.nextInt();
    		
    		
    		if (sayi>5 && sayi<10) {
				System.out.println("Girilen sayý 5 ile 10 arasý oldugu için iþleme alýnmadý");
				continue;      // yok sayar. pas geçer. kodu durdurmaz...
			}
    		
    		sayiToplam+=sayi;
		}
    	
    	System.out.println("Girdiginiz sayýlarýn toplamý : "+sayiToplam);
    	
 
    	
    	scan.close();
    	
    }

}
