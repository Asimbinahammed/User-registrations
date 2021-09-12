package bridgelab;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class s {
    private static Scanner sc = new Scanner(System.in);
    //First Name & Last Name
    private static final String FIRST_LAST_NAME = "[A-Z][a-z]{3}";
    private static final Pattern FIRST_NAME_PATTERN = Pattern.compile(FIRST_LAST_NAME);
    private static final Pattern LAST_NAME_PATTERN = Pattern.compile(FIRST_LAST_NAME);
    //For Email Validation
    private static final String EMAIL_ID = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_ID);
    //For Phone Number Validation
    private static final String PHONE_NUM = "^[0-9]{2}\\s[0-9]{10}$";
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_NUM);
    //For Password Validation
    private static final String PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()-_=+]).{8,}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD);

    //Checking for First Name
    private void check_Valid_FirstName(String firstName) {
        Matcher m = FIRST_NAME_PATTERN.matcher(firstName);
        if (m.find()) {
            System.out.println("The given First Name satisfies all the conditions mentioned.");
        } else {
            System.out.println("Invalid First Name");
        }
    }

    //Checking for Last Name
    private void check_Valid_LastName(String lastName) {
        //Matcher Class
        Matcher m = LAST_NAME_PATTERN.matcher(lastName);
        if (m.find()) {
            System.out.println("The given Last Name satisfies all the conditions mentioned.");
        } else {
            System.out.println("Invalid Last Name");
        }
    }

    //Checking for Email ID
    private void check_Valid_Email(String email) {
        Matcher m = EMAIL_PATTERN.matcher(email);
        if (m.find()) {
            System.out.println("The given Email ID satisfies all the conditions mentioned.");
        } else {
            System.out.println("Invalid Email ID");
        }
    }

    private void check_Valid_Email(ArrayList<String> emails) {
        for (String email : emails) {
            System.out.println("Is the email valid? " + email.matches(EMAIL_ID));
        }
    }

    //Checking for Phone No.
    private void check_Phone_Num(String phoneNum) {
        Matcher m = PHONE_PATTERN.matcher(phoneNum);
        if (m.find()) {
            System.out.println("The given Phone Number satisfies all the conditions mentioned.");
        } else {
            System.out.println("Invalid Phone Number");
        }
    }

    //Checking for Password
    private void check_Password(String password) {
        Matcher m = PASSWORD_PATTERN.matcher(password);
        if (m.find()) {
            System.out.println("The given Password satisfies all the conditions mentioned.");
        } else {
            System.out.println("Invalid Password");
        }
    }

    //Main Method
    public static void main(String[] args) {
        s registration = new s();
//        System.out.print("Enter First Name (First letter Capital) : ");
//        String firstName = sc.next();
//        registration.check_Valid_FirstName(firstName);
//
//        System.out.print("Enter Last Name (First letter Capital) : ");
//        String lastName = sc.next();
//        registration.check_Valid_LastName(lastName);
//
//        System.out.print("Enter Email Address : ");
//        String email = sc.next();
//        registration.check_Valid_Email(email);
//
//        System.out.print("Enter Phone No. : ");
//        String phoneNum = sc.next();
//        registration.check_Phone_Num(phoneNum);
//
//        System.out.print("Enter Password : ");
//        String password = sc.next();
//        registration.check_Password(password);

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
        registration.check_Valid_Email(emails);
    }
}