import java.util.*;

class SpecialChars {
	public static void main(String[] args) {
		String line = "This is a text# with& some* special% characters!";
		int numSpecialChars = 0;
		String specialChars = "";
		
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (c == '#' || c == '&' || c == '*' || c == '%') {
				numSpecialChars++;
				specialChars += c + " ";
			}
		}
		
		System.out.println("The line contains " + numSpecialChars + " special character(s): " + specialChars);
	}
}

