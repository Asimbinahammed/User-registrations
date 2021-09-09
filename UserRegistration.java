package bridgelab;

import java.util.Scanner;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);

	// validating first name
	public void validateName() {
		String pattern = "^[A-Z][a-zA-z]{2,}$"; // declaring string pattern

		// first name validation
		System.out.println("Enter the first name");
		String firstName = scanner.next();

		// checking whether first name matches pattern or not
		if (firstName.matches(pattern)) {
			System.out.println("Valid first Name");
		} else {
			System.out.println("Invalid first name");
			validateName();
		}

		// second name validation
		System.out.println("Enter the second name");
		String secondName = scanner.next();

		// checking whether second name matches pattern or not
		if (secondName.matches(pattern)) {
			System.out.println("Valid second Name");
		} else {
			System.out.println("Invalid second name");
			validateName();
		}

	}

	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to User registration");
		UserRegistration user = new UserRegistration();
		user.validateName();
	}

}
