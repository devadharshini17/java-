
import java.util.Scanner;

class VowelCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a statement: ");
        String statement = input.nextLine();
        int count = 0;
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == 'a' || statement.charAt(i) == 'e' || statement.charAt(i) == 'i'
                    || statement.charAt(i) == 'o' || statement.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("The number of vowels in the statement is: " + count);
    }
}