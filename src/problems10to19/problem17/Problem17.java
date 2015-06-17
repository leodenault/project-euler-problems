package problems10to19.problem17;

public class Problem17 {
	public static void main(String[] args) {
		String numbers = "";
		for (int i = 1; i < 100; i++) {
			numbers += lowestTwoDigitsWord(i);
		}
		
		for (int i = 100; i < 1000; i++) {
			numbers += hundredsWord(i);
		}
		
		numbers += "one thousand";
		
		int length = 0;
		for (char c : numbers.toCharArray()) {
			if (Character.isLetter(c)) {
				length++;
			}
		}
		
		System.out.println(length);
	}
	
	private static String lowestTwoDigitsWord(int number) {
		switch (number) {
			case 0:
				return "";
			case 1:
				return "one";
			case 2:
				return "two";
			case 3:
				return "three";
			case 4:
				return "four";
			case 5:
				return "five";
			case 6:
				return "six";
			case 7:
				return "seven";
			case 8:
				return "eight";
			case 9:
				return "nine";
			case 10:
				return "ten";
			case 11:
				return "eleven";
			case 12:
				return "twelve";
			case 13:
				return "thirteen";
			case 14:
				return "fourteen";
			case 15:
				return "fifteen";
			case 16:
				return "sixteen";
			case 17:
				return "seventeen";
			case 18:
				return "eighteen";
			case 19:
				return "nineteen";
			default:
				return twoDigitGreaterThanTwentyWord(number);
		}
	}
	
	private static String tensWord(int number) {
		switch (number) {
			case 2:
				return "twenty";
			case 3:
				return "thirty";
			case 4:
				return "forty";
			case 5:
				return "fifty";
			case 6:
				return "sixty";
			case 7:
				return "seventy";
			case 8:
				return "eighty";
			default:
				return "ninety";
		}
	}
	
	private static String twoDigitGreaterThanTwentyWord(int number) {
		int lowerDigit = number % 10;
		int greaterDigit = number / 10;
		
		String word = tensWord(greaterDigit);
		String right = lowestTwoDigitsWord(lowerDigit);
		if (!right.isEmpty()) {
			word += "-" + right;
		}
		
		return word;
	}
	
	private static String hundredsWord(int number) {
		int hundred = number / 100;
		int lowestDigits = number % 100;
		
		String word = lowestTwoDigitsWord(hundred) + " hundred";
		String right = lowestTwoDigitsWord(lowestDigits);
		if (!right.isEmpty()) {
			word += " and " + right;
		}
		
		return word;
	}
}
