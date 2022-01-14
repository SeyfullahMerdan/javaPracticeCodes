package instructions_Variable_Scanner;

public class Q1 {

	public static void main(String[] args) {

		
		int sayilar=12345;
		int birler= sayilar%10; //birler basamagi sayinin 10 a bolumunden kalanýdýr.-->5
		int onlar=(sayilar/10)%10;
		int yuzler=(sayilar/100)%10;
		int binler=(sayilar/1000)%10;
		int onBinler=(sayilar/10000);
		
		/*
	    System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);
		 */
		
		// consolda alt satira yazdýrmak için "\n"  komutu kullanýlýr.
		
		System.out.println(onBinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler);
		
		
		
		
		
		
	}

}
