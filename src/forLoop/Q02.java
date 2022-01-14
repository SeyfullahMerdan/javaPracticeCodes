package forLoop;

public class Q02 {
    public static void main(String[] args) {


   // 0-255 e kadar olan harflerin , sayý ve harf degerini konsola yazdýrýnýz.
        
    	
    	for (int i = 1; i <= 255; i++) {
    		char  harf=(char) i; // i variable'ý char’dan buyuk oldgu icin data casting komutu ile cahr’a atandý. elimizle yaptýk.
    		System.out.println(i+ " "+harf);   // i degiþtikçe yazma iþlemi lazým. sýrayla hepsini bilecem..
		}
    	
    	
   
    }
}


