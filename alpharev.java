import java.util.*;
import java.io.*;
class Alphabetically 
{
    public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        char[] letters = word.toCharArray();
 
        Array.sort(letters);
        for(char c : letters) {
            System.out.print(c);
        }
    }
}		