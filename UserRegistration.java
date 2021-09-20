/**
 * @author: Asim Ahammed
 *
 */

package bridgelab;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	// For Email Validation
	private static final String EMAIL_ID = "^[A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_ID);

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

	// validating password
	public void passwordValidation() {
		System.out.println("Enter the Password");
		String password = scanner.next();
		// password regex
		String pattern = "^(?=.[A-Za-z0-9])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";

		// checking whether password matches pattern or not
		if (password.matches(pattern)) {
			System.out.println("Valid password ");
		} else {
			System.out.println("Invalid password ");
			passwordValidation();
		}
	}
	
	//validating sample emails
	private void checkValidEmail(ArrayList<String> emails) {
		for (String email : emails) {
			System.out.println("Is the email valid? " + email.matches(EMAIL_ID));
		}
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to User registration");
		UserRegistration user = new UserRegistration();
		user.userDirecting();
	}

	public void userDirecting() {
		validateName(); // first and last names validation
		validateEmail(); // email validation
		phoneNumberValidation(); // phone number validation
		passwordValidation();// password validation

		// saving each sample email in arraylist
		ArrayList<String> emails = new ArrayList<String>();
		emails.add("abc@yahoo.com");
		emails.add("abc-100@yahoo.com");
		emails.add("abc.100@yahoo.com");
		emails.add("abc111@abc.com");
		emails.add("abc-100@abc.net");
		emails.add("abc.100@abc.com.au");
		emails.add("abc@1.com");
		emails.add("abc@gmail.com.com");
		emails.add("abc");
		emails.add("abc@.com.my");
		emails.add("abc123@gmail.a");
		emails.add("abc123@.com");
		emails.add("abc123@.com.com");
		emails.add(".abc@abc.com");
		emails.add("abc()*@gmail.com");
		emails.add("abc@%*.com");
		emails.add("abc..2002@gmail.com");
		emails.add("abc.@gmail.com");
		emails.add("abc@abc@gmail.com");
		emails.add("abc@gmail.com.1a");
		emails.add("abc@gmail.com.aa.au");
		checkValidEmail(emails);
	}

}