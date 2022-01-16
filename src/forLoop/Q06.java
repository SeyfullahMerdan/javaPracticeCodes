package forLoop;

import java.util.Scanner;

public class Q06 {

    /*  Problem Tanýnýmý
       2 boyutlu bir tablo olarak, ekrana çarpým tablosunu hesaplayýp yazan kodu yazýnýz
       
       Örnek Ekran Çýktýsý
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran çýktýsý 5 x 5 boyutlarý için örnek olarak verilmiþtir.
       isterseniz boyutlarý klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */
    public static void main(String[] args) {
        
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Çarpým tablosunun boyutunu giriniz : ");
    	int boyut=scan.nextInt();
    	
    	
    	
    	for (int i = 1; i <= boyut; i++) {
			
    		for (int j = 1; j <= boyut; j++) {
				
    			System.out.print(i * j );
    			System.out.print(" ");
    			
			}
			System.out.println(" ");
		}
    	
    	

    		
    	scan.close();
    	
    }
}
