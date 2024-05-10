import java.util.Scanner;

public class Tax1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Enter card number: ");
        String cardNumber = scanner.nextLine();

        int CARDNUMBER = 16;
        
        if (cardNumber.length() == CARDNUMBER) {
            System.out.println("Valid card number");
        } else {
            System.out.println("Invalid card number");        
        }

        char firstNumber = cardNumber.charAt(0);

        if (firstNumber != '4' && firstNumber != '5' && firstNumber != '6') {
            System.out.println(cardNumber + " is invalid");
        } else {
            System.out.println(cardNumber + " is valid");
        }
    }
}
