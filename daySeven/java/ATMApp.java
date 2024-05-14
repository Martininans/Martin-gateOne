import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMApp {
	private static Map<String, Account> accounts = new HashMap<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	System.out.println("1. Create Account\n
			2. Close Account\n
			3. Deposit\n
			4. Withdraw\n
			5. Transfer\n
			6. Change PIN\n
			7. Exit");
	int choice = scanner.nextInt();
	scanner.nextLine();

	switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    closeAccount();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    transfer();
                    break;
                case 6:
                    changePin();
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");

}
}