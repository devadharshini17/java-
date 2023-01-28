import java.util.Scanner;

class strtoint 
{
	public static void main(String[] args) 
	{
      	Scanner sc = new Scanner(System.in);
        	System.out.println("Please enter a string: ");
        	String inputString = sc.nextLine();
        	int outputInteger;

        	try 
		{
            	outputInteger = Integer.parseInt(inputString);
        	} 
		catch (NumberFormatException e) {
            System.out.println("String could not be converted to integer.");
            return;
        }

        System.out.println("The converted integer is " + outputInteger);
    }

}