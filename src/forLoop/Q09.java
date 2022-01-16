package forLoop;

public class Q09 {

    public static void main(String[] args) {
       
    	// Çarpým tablosunu 10a kadar ekrana yazdýrýnýz.
    	
    	

    	
    	for(int carpan1=1;carpan1<=10;carpan1++)
        {

            for(int carpan2=1;carpan2<=10;carpan2++)
                System.out.println(carpan1+" x "+carpan2+" = "+ (carpan1*carpan2));

            System.out.println();
        }
    	
    	
    	
    	//////////////////////////////////////////////////////////////////////////////////////////
    	
    	for (int i = 1; i <= 10; i++) {
			System.out.println(1*i);
		}
    	
    	
    	System.out.println();
    	
    	
    	
    	
    	
    	
    	
    	///////////////////////////////////////////////////////////////////////////////////////////

    	for (int i = 1; i <= 10; i++) {
				
    		for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (j*i));
			}
    		
    		System.out.println();
		}
    	
    	
    	
       

    }
}
