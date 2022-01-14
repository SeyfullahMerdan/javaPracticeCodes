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

		String arr[] = str.split(""); // Str yi hi�lige g�re par�alad�k ve her bir par�ay� arraye att�k,arayin eleman�
										// yapt�k
		// List <String> list=new ArrayList<>();

		String tekrar = "";
		int sayac = 0;
		int maxsayac = 0;

		for (int i = 0; i < arr.length; i++) { // kar��la�t�r�lan karakter kontrolu

			for (int j = i + 1; j < arr.length; j++) { // Kar��la�t�ran� kar��la�t�rd�g�m�z karakter kontrol�

				if (arr[i].equalsIgnoreCase(arr[j])) { // E�it karakterleri kontrol ettim ve e�it olanlar� sayd�racag�z.
					sayac++;
				}
			} // Buraya kadar kar��la�t�r�lan say�lar� sayd�rd�k.
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
