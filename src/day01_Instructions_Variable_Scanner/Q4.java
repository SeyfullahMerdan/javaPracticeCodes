package day01_Instructions_Variable_Scanner;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

	

        Scanner scan=new Scanner(System.in)	;
        
        System.out.print("�lk sayiyi girin:");
        
        int sayi2=scan.nextInt();
        
        System.out.print("�kinci sayiyi girin:");
		
        int sayi1=scan.nextInt();
        
        System.out.println("toplam:"+(sayi1+sayi2));
        System.out.print("fark:"+(sayi1+sayi2)); 
        System.out.println("�arp�m"+(sayi1*sayi2));
        System.out.print("b�l�m"+(sayi1/sayi2));
       		 
      
        
        scan.close();

	
	}
}
