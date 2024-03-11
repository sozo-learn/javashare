import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class SqueakyClean {
	
	static String clean(String identifier) {
		// for converting leet characters
		HashMap<Character, Character> leetChars = new HashMap<>();
		leetChars.put('4', 'a');
		leetChars.put('3', 'e');
		leetChars.put('0', 'o');
		leetChars.put('1', 'l');
		leetChars.put('7', 't');

		
		// will be used to return a cleaned string
		StringBuilder newStr = new StringBuilder();
		
		// for checking if character being evaluated is a leet character
		List<Character> leetCharList = new ArrayList<>();
		leetCharList.addAll(List.of('4', '3', '0', '1', '7'));
		
		// populate chrs array with the characters from the identifier string
		int strLen = identifier.length();
		char[] chrs = new char[strLen];
		identifier.getChars(0, strLen, chrs, 0);

		boolean camelize = false;  // if true, make camel case 
		boolean keepOrigChar = true;
		char newChar = ' ';

		for (char chr : chrs) {
			if (leetCharList.contains(chr)) {
				newChar = leetChars.get(chr);
				keepOrigChar = false;
			} else if (camelize) {
				newChar = Character.toUpperCase(chr);
				camelize = false;
				keepOrigChar = false;
			} else if (chr == ' ') {
				newChar = '_';
				keepOrigChar = false;
			} else if (chr == '-') {
				camelize = true;
				continue;
			} else if (!((chr >= 65 && chr <=90) || (chr >= 97 && chr <=122))) {
				continue;
			}

			// add character to new string
			if (keepOrigChar) {
				newStr.append(chr);
			} else {
				newStr.append(newChar);
				keepOrigChar = true;
			}
		}

		return newStr.toString();
	}
}
