import java.util.Scanner;
import java.io.*;
class ReverseWord 
{
  public static void main(String[] args) 
  {
      Scanner sc= new Scanner(System.in);
	System.out.print("Enter a string: ");
	String str= sc.nextLine();
      
      String reverse = "";
       
      for(int i = str.length() - 1; i >= 0; i--)
      {
          reverse = reverse + str.charAt(i);
      }
       
      System.out.println("Reversed word: " + reverse);
  }
}