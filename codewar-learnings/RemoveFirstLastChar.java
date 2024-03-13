
/**
 *  task: Create a function that 
 *  removes the first and last characters of a string
 *  my solution involved building a string excluding 
 *  the first and last characters.
 *  Code would've been simpler if I knew about `substring` 😅
 */
public class Main {

	public static void main(String[] args) {
		String testStr = "eloquent";

		// my solution
		System.out.println(remove(testStr));

		// using the substring method
		System.out.println(testStr.substring(1, testStr.length() - 1));

	}

	public static String remove(String str) {

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < str.length() - 1; i++) {
			sb.append(str.charAt(i));

		}

		return sb.toString();
	}

}
