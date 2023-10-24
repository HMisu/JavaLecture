package date_231020;

public class Reverse {

	public static String reverseString(String str) {
		String result = "";
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			result = c + result;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(reverseString("123456"));
	}

}
