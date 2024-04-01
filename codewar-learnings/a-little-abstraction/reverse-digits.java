public class Main {
	public static void main(String[] args) {
		long n = 13595;
		int[] test = digitize(n);

		for (int i : test) {
			System.out.printf("%d, ", i);
		}
	}

	// take a number and reverse the order of digits
	// return it in an array
	public static int[] digitize(long n) {
		String numString = String.valueOf(n);
		int numOfChars = numString.length();
		int position = numOfChars - 1;

		int[] arr = new int[numOfChars];

		for (int i = 0; i < numOfChars; i++) {
			arr[i] = Character.getNumericValue(numString.charAt(position--));
		}

		return arr;
	}

	public static int[] digitizeV1(long n) {
		String numString = String.valueOf(n);
		int numOfChars = numString.length();

		int[] arr = new int[numOfChars];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Character.getNumericValue(numString.charAt((numOfChars - 1) - i));
		}

		return arr;
	}
}
