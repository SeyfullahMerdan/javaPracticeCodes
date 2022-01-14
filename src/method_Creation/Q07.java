package method_Creation;

public class Q07 {

	public static void main(String[] args) {

		String data = "Java'yi Seviyorum.";

		reverseString(data);

	}

	private static void reverseString(String data) {

		String reverse = "";

		for (int i = data.length() - 1; i >= 0; i--) {

			reverse += data.charAt(i);

		}

		System.out.println(reverse);

	}

}
