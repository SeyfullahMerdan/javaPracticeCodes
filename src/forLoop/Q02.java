package forLoop;

public class Q02 {
    public static void main(String[] args) {


   // 0-255 e kadar olan harflerin , say� ve harf degerini konsola yazd�r�n�z.
        
    	
    	for (int i = 1; i <= 255; i++) {
    		char  harf=(char) i; // i variable'� char�dan buyuk oldgu icin data casting komutu ile cahr�a atand�. elimizle yapt�k.
    		System.out.println(i+ " "+harf);   // i degi�tik�e yazma i�lemi laz�m. s�rayla hepsini bilecem..
		}
    	
    	
   
    }
}


