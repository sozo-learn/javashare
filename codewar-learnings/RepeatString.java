public class Main {

	public static void main(String[] args) {
		// my solution
		System.out.println(repeatStr(6, "A"));

		// til learned about the `repeat` method on strings 😅
		System.out.println("A".repeat(6));

	}

	public static String repeatStr(final int repeat, final String string) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < repeat; i++) {
			sb.append(string);
		}

		return sb.toString();
	}

}
