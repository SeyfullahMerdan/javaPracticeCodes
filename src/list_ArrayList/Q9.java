package list_ArrayList;

import java.util.Scanner;

public class Q9 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		/*
		 * Write a Java program to get a String from user as input and find the
		 * maximumCounts occurring character in that string. (Ignore case sensitivity)
		 * 
		 * Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri
		 * yazdiriniz input : Learning java is easy output: maximumCounts occurring
		 * character is : a
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Metin giriniz :");
		String str = scan.nextLine();

		String arr[] = str.split(""); // Str yi hiçlige göre parçaladýk ve her bir parçayý arraye attýk,arayin elemaný
										// yaptýk
		// List <String> list=new ArrayList<>();

		String tekrar = "";
		int sayac = 0;
		int maxsayac = 0;

		for (int i = 0; i < arr.length; i++) { // karþýlaþtýrýlan karakter kontrolu

			for (int j = i + 1; j < arr.length; j++) { // Karþýlaþtýraný karþýlaþtýrdýgýmýz karakter kontrolü

				if (arr[i].equalsIgnoreCase(arr[j])) { // Eþit karakterleri kontrol ettim ve eþit olanlarý saydýracagýz.
					sayac++;
				}
			} // Buraya kadar karþýlaþtýrýlan sayýlarý saydýrdýk.
			if (sayac > maxsayac) {
				maxsayac = sayac;
				tekrar = arr[i];
			} else if (sayac == maxsayac) {
				tekrar += ", " + arr[i];

			}
			sayac = 0;
		}

		System.out.println(tekrar);
	}
}
