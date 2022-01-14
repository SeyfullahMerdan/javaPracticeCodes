package method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {


// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
       
      Scanner scan=new Scanner(System.in);
      
      System.out.println("Çevirilicek birimi giriniz : ");
      String birim=scan.next();
      
      System.out.println("Çevirilicek birimin degerini giriniz : ");
      double miktar=scan.nextDouble();
    	
      cevir(birim, miktar);
    	
    	
    	
    	scan.close();
    	
    }

	private static void cevir(String birim, double miktar) {
		
		
		switch (birim) {
		case "saat":
			System.out.println("Girilen saatin saniye deðeri : "+miktar*60*60);
			break;
        case "mil":
			System.out.println("Girilen milin kilometre deðeri : " + miktar*1.6);
			break;
        case "kg":
			System.out.println("Girilen kilogramýn gram deðeri : " + miktar*1000+"gram");
	        break;
		
        default:
			System.out.println("Geçersiz giriþ yaptýnýz. Bir daha deneyin.");

			break;
		}
		
		
		
		
		
		
		
	}
}

