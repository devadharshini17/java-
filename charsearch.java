import java.util.Scanner;

 class CharacterInString {
  public static void main(String[] args) { 
    String str = "Hello World";
    char character = 'o';
    boolean found = false;
    for (int i = 0; i < str.length(); i++) 
    { 
        if (str.charAt(i) == character) {
            found = true;
            System.out.println("Character '" + character + "' found at index " + i);
        }
    }
    if(!found) {
        System.out.println("Character '" + character + "' not found in the string");
    }
  } 
}