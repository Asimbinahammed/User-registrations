package bridgelab;

import java.util.Scanner;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);

	// validating first name
	public void validateFirstName() {
		String pattern = "^[A-z][a-zA-z]{2,}$"; // declaring string pattern
		Scanner sd = new Scanner(System.in);

		System.out.println("Enter the first name");
		String firstName = scanner.next();

		// checking whether firstname matches pattern ot not
		if (firstName.matches(pattern)) {
			System.out.println("Valid first Name");
		} else {
			System.out.println("Invalid first name");
			validateFirstName();
		}
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to User registration");
		UserRegistration user = new UserRegistration();
		user.validateFirstName();
	}

}
