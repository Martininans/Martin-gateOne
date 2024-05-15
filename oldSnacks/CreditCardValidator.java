import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, Kindly Enter card details to verify:");
        String cardNumber = scanner.nextLine();
	int digitLength = cardNumber.length();
        
	if (isValidCreditCard(cardNumber)) {
            String cardType = getCreditCardType(cardNumber);
            System.out.println("Credit card type: " + cardType);
	    System.out.println("Credit card Number: " + cardNumber);
	    System.out.println("Credit card Digits Length: " + digitLength);
            System.out.println("Credit card Validity status: Valid");
        } else {
            System.out.println("Validity: Invalid");
        }
    }

    public static boolean isValidCreditCard(String cardNumber) {
        if (cardNumber.length() < 13 || cardNumber.length() > 16) {
            return false;
        }

        if (cardNumber.startsWith("4") || cardNumber.startsWith("5") || cardNumber.startsWith("37") || cardNumber.startsWith("6")) {
            return true;
        }

        return false;
    }

    public static String getCreditCardType(String cardNumber) {
        if (cardNumber.startsWith("4")) {
            return "Visa";
        } else if (cardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            return "American Express";
        } else if (cardNumber.startsWith("6")) {
            return "Discover";
        } else {
            return "Unknown";
        }
    }
}
