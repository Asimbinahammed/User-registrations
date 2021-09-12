/**
 * @author Asim
 *
 */

package bridgelab;

import java.util.Scanner;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);

	// validating first name
	public void validateName() {
		String pattern = "^[A-Z][a-zA-z]{2,}$"; // declaring Name pattern

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

	// validating email
	public void validateEmail() {
		// email regex
		String pattern = "^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$";
		System.out.println("Enter valid email");
		String email = scanner.next();

		// checking whether email matches the pattern
		if (email.matches(pattern)) {
			System.out.println("valid email");
		} else {
			System.out.println("invalid email");
			validateEmail();
		}
	}

	// validating phone number
	public void phoneNumberValidation() {
		// phone number regex
		String pattern = "^([0-9]{2}[\\-])*[0-9]{10}$";
		System.out.println("Enter the Phone number");
		String phNum = scanner.next();

		// checking whether phone number matches pattern or not
		if (phNum.matches(pattern)) {
			System.out.println("Valid phone number ");
		} else {
			System.out.println("Invalid phone number ");
			phoneNumberValidation();
		}
	}
	
	//validating password
	public void passwordValidation() {
		System.out.println("Enter the Password");
		//password of 8 letters
		String password = scanner.next();
		String pattern = "^[A-Za-z0-9]{8,}$";
		
		//checking whether password matches pattern or not
		if (password.matches(pattern)) {
			System.out.println("Valid password ");
		} else {
			System.out.println("Invalid password ");
			passwordValidation();
		}
		
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to User registration");
		UserRegistration user = new UserRegistration();
		// user.validateName(); // first and last names validation
		// user.validateEmail(); // email validation
		//user.phoneNumberValidation(); // phone number validation
		user.passwordValidation();
	}

}
