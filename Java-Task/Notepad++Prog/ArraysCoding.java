public class ArraysCoding{
	public static void main(String[] args){
		int a[]={11,0,10,2,0,3,4};
		int nozero=0;
	
	}
}


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner; // Required to use the Scanner class

public class IndianPhoneNumberValidator {

    // The regex pattern captures all cases: optional country codes,
    // and the correct starting digit (6-9) for a 10-digit number.
    // The pattern allows optional spaces or hyphens within the number.
    // The pattern allows for optional +91, 0, or 91 prefixes before the 10-digit number.
    // The 10 digit number must start with a digit between 6 and 9.
    private static final String INDIAN_PHONE_NUMBER_REGEX = "^(?:(?:\\+|0{0,2})91[\\-\\s]?)?[6-9]\\d{9}$"; // A combined regex pattern to validate Indian mobile numbers

    public static boolean isValidIndianPhoneNumber(String phoneNumber) {
        // Remove any spaces or hyphens from the input 
        // to simplify the matching against the core number pattern.
        // Use replaceAll("\\s", "") to remove all whitespace characters.
        // Use replaceAll("-", "") to remove all hyphens.
        String cleanedPhoneNumber = phoneNumber.replaceAll("[\\s-]", "");

        // Compile the regex pattern into a Pattern object.
        // Compiling the pattern once is more efficient if validating many numbers.
        Pattern pattern = Pattern.compile(INDIAN_PHONE_NUMBER_REGEX);

        // Create a Matcher object to perform the matching operation.
        Matcher matcher = pattern.matcher(cleanedPhoneNumber);

        // The matches() method attempts to match the entire input sequence 
        // against the pattern. If it's a full match, it returns true, otherwise false.
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Get the user's input.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Indian phone number: ");
        String userInput = scanner.nextLine();

        // Call the validation method and provide feedback to the user.
        if (isValidIndianPhoneNumber(userInput)) {
            System.out.println("The entered phone number is valid.");
        } else {
            System.out.println("The entered phone number is NOT valid.");
        }
        scanner.close(); // Remember to close the scanner to prevent resource leaks
    }
}













// ========Phone number validation===

public boolean isValidIndianMobile(String phoneNumber) {
    // 1. Check if null or empty
    if (phoneNumber == null || phoneNumber.isEmpty()) {
        return false;
    }

    // 2. Check length is exactly 10
    if (phoneNumber.length() != 10) {
        return false;
    }

    // 3. Check all characters are digits
    for (int i = 0; i < phoneNumber.length(); i++) {
        if (!Character.isDigit(phoneNumber.charAt(i))) {
            return false;
        }
    }

    // 4. Check first digit is 6,7,8, or 9
    char firstDigit = phoneNumber.charAt(0);
    if (firstDigit != '6' && firstDigit != '7' && firstDigit != '8' && firstDigit != '9') {
        return false;
    }

    // If all checks pass → Valid
    return true;
}
