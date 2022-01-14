package forLoop;

public class Q01 {
    /*

       sayacı ritmik ilerleyen ve adım sayısı beli ise for kullanılır
       ***degilse WHİLE kullanılır, eğer döngüye bir kez mutlaka girilecekse DO_WHİLE kullanılır**

      
        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamları ekrana yazdırınız (büyükten küçüge).

         Ekran çıktısı
        91
        78
        65
        52
        39
        26
        13       */
    public static void main(String[] args) {
    	
    	int toplam=0;
    	for (int i = 100; i >= 0 ; i--) {
			
    		if (i%13==0) {
    			System.out.println(i+ " ");
				toplam+=i;
			}
    		
		}
    	
    	System.out.println(); // alt satıra atması için koyduk
    	System.out.println(toplam);

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
