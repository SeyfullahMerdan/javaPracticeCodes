package day10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Kullan�c�dan al�nan bir tam say�ya kadar Fibonacci dizisi olu�turun.
		// 1-1- 2-3- 5- 8- 13- 21- 34....
		
		Scanner scan=new Scanner(System.in);                     // 1 - 1    ikisinin toplam� =2 bunu listeye ekle
		System.out.println("L�tfen bir tam sy� giriniz : ");    //  1-2  nin toplam�
		int sayi=scan.nextInt();
		int altSayi=2;
		List <Integer> fibonacciList=new ArrayList<>();
		fibonacciList.add(1);	
		fibonacciList.add(1);
		       // 0  --- 20
		while ( altSayi<sayi ) {
		    
			altSayi=fibonacciList.get(fibonacciList.size()-1)  +  fibonacciList.get(fibonacciList.size()-2);
			
			if (sayi<altSayi) {
				break;
			}	
			fibonacciList.add(altSayi);
		
			altSayi++;	
		}
	
		System.out.println(fibonacciList);
		
	}
	}



