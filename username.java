

import java.util.Scanner;

class UserNameCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the user name:");
		String userName1 = sc.nextLine();
		
		System.out.println("Reenter the user name:");
		String userName2 = sc.nextLine();
		
		if(userName1.equals(userName2)) {
			System.out.println("User name is Valid");
		}
		else {
			System.out.println("User name is Invalid");
		}
		sc.close();
	}

}