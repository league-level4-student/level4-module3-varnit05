package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static void main(String[] args) {
		
	
	}
	public static double divide (double one, double two) throws IllegalArgumentException {
		
		if (two == 0) {
			throw new IllegalArgumentException();
			
			
		}
		return one/two;
	}
	
	public static String reverseString (String reverse ) throws IllegalStateException {
		for (int i = 0; i < reverse.length(); i++) {
			
		int temp = 0;
		temp = reverse.charAt(0);
		temp = reverse.charAt(1) ;
		temp = reverse.charAt(0)= reverse.charAt(1);
		reverse.charAt(0);
		reverse.charAt(1);
		reverse.charAt(2);
		return "";
		}
		return reverse;
		
}
	

}

