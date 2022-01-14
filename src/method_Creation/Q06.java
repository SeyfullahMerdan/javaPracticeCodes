package method_Creation;

public class Q06 {

	/*
	 * Bir String içindeki tüm karakterleri en fazla bir kez yazdýran parametreli
	 * bir method yazýnýz Test Data: input: "aabbcccccddddaaa" output: abcd
	 */

	public static void main(String[] args) {

		String data = "aabbcccccddddaaa";

		unique(data);

	}

	private static void unique(String data) {

		String unique="";
		
		for (int i = 0; i < data.length()-1; i++) {
			
			if (!unique.contains(data.substring(i, i+1))) {
				unique+=data.charAt(i);
			} else {
				continue;
			}		
		}
		
		System.out.println(unique);
		
		
		
	}

}
