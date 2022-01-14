package varargs;

public class Q1 {

	public static void main(String[] args) {
	
		
		concat("h", "a" , "c" , "e" , "r" );
		
		concat("her"," ", "yer" , " ","bana" ," ", "güzel" ," ", "gelir" );
		
		
	}

	private static void concat(String...strler) {
	
		String yeniStr="";
		
		for (String str : strler) {
			
			yeniStr=yeniStr.concat(str);
			
		}
		
		System.out.println(yeniStr);
		
		
		
	}

}
