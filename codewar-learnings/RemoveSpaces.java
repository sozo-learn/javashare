public class Main {
	/**
	 * Case of 
	 * "This would've been simpler if
	 *  I knew the method existed" 😅
	 * Challenge: remove all spaces from string
	 * V1 is my solution
	 * V2 is what I learned after I submitted my solution 
	 */

	public static void main(String[] args) {
		String test = "cat dog bat";
		
		System.out.println(noSpaceV2(test));
	}

	public static String noSpaceV1(final String x) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) != ' ') {
				sb.append(x.charAt(i));
			}
		}

		return sb.toString();
	}
	
	public static String noSpaceV2(final String x) {
        return x.replace(" ", "");
    }

}
