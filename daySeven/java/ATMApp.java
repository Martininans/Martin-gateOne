import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMApp {
	private static List<Account> accounts = new ArrayList<>();
	private static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
	String prompt = """	
		1. Create Account
		2. Close Account
		3. Deposit
		4. Withdraw
		5. Check Balance
		6. Transfer
		7. Change PIN
		8. Exit""";
	while (true) {
	System.out.println("Welcome to Semicolon International Bank");
	System.out.println("*************************");
	System.out.println(prompt);
	System.out.println("*************************");
	int choice = userInput.nextInt();
	userInput.nextLine();

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
	balance();
	break;
	case 6:
	transfer();
	break;
	case 7:
	changePin();
	break;
	case 8:
	System.out.println("*************************");
	System.out.println("Exiting program.");
	System.out.println("*************************");
	return;
	default:
	System.out.println("*************************");
	System.out.println("Invalid choice. Please try again.");
	System.out.println("*************************");
	}
	}
	}

	private static void createAccount() {
	System.out.println("Enter first name:");
	String firstName = userInput.nextLine();
	System.out.println("Enter last name:");
	String lastName = userInput.nextLine();
	System.out.println("Create PIN:");
	String pin =userInput.nextLine();

	System.out.println("Enter initial balance:");
	double initialBalance = userInput.nextDouble();
	userInput.nextLine();

	Account account = new Account(firstName, lastName, pin, initialBalance);
	accounts.add(account);
	System.out.println("*************************");
	System.out.println("Account created successfully.");
	System.out.println("*************************");
	}

	private static void closeAccount() {
	System.out.println("Enter first name:");
	String firstName = userInput.nextLine();
	System.out.println("Enter last name:");
	String lastName = userInput.nextLine();

	Account accountToRemove = null;
	for (Account account : accounts) {
	if (account.getFirstName().equals(firstName) && account.getLastName().equals(lastName)) {
	accountToRemove = account;
	break;
	}
	}

	if (accountToRemove != null) {
	accounts.remove(accountToRemove);
	System.out.println("Account closed successfully.");
	} else {
	System.out.println("Account not found.");
	}
	}

	private static void deposit() {
	System.out.println("Enter first name:");
	String firstName = userInput.nextLine();
	System.out.println("Enter last name:");
	String lastName = userInput.nextLine();
	System.out.println("Enter PIN:");
	String pin = userInput.nextLine();

	Account account = findAccount(firstName, lastName);
	if (account != null && account.checkPin(pin)) {
	System.out.println("Enter deposit amount:");
	double amount = userInput.nextDouble();
	account.deposit(amount);
	} else {
	System.out.println("Account not found or incorrect PIN.");
	}
	}

	private static void withdraw() {
	System.out.println("Enter first name:");
	String firstName = userInput.nextLine();
	System.out.println("Enter last name:");
	String lastName = userInput.nextLine();
	System.out.println("Enter PIN:");
	String pin = userInput.nextLine();

	Account account = findAccount(firstName, lastName);
	if (account != null && account.checkPin(pin)) {
	System.out.println("Enter withdrawal amount:");
	double amount = userInput.nextDouble();
	account.withdraw(amount);
	} else {
	System.out.println("Account not found or incorrect PIN.");
		}
	}
	private static void balance() {
	System.out.println("Enter first name:");
	String firstName = userInput.nextLine();
	System.out.println("Enter last name:");
	String lastName = userInput.nextLine();

	Account account = findAccount(firstName, lastName);
	System.out.println("Enter PIN:");
	String pin = userInput.nextLine();
	if (account != null && account.checkPin(pin)) {
	double balance = account.getBalance();
	System.out.println("Your current balance is: " + balance);
	} else {
	System.out.println("Account not found or incorrect PIN.");
	}
	}
	private static void transfer() {
	System.out.println("Enter first name:");
	String firstName = userInput.nextLine();
	System.out.println("Enter last name:");
	String lastName = userInput.nextLine();
	System.out.println("Enter PIN:");
	String pin = userInput.nextLine();

	Account senderAccount = findAccount(firstName, lastName);
	if (senderAccount != null && senderAccount.checkPin(pin)) {
	System.out.println("Enter recipient first name:");
	String recipientFirstName = userInput.nextLine();
	System.out.println("Enter recipient last name:");
	String recipientLastName = userInput.nextLine();

	Account recipientAccount = findAccount(recipientFirstName, recipientLastName);
	if (recipientAccount != null) {
	System.out.println("Enter amount to transfer:");
	double amount = userInput.nextDouble();
	senderAccount.transfer(recipientAccount, amount);
	} else {
	System.out.println("Recipient account not found.");
		}
	} else {
	System.out.println("Account not found or incorrect PIN.");
	}
	}

	private static void changePin() {
	System.out.println("Enter first name:");
	String firstName = userInput.nextLine();
	System.out.println("Enter last name:");
	String lastName = userInput.nextLine();
	System.out.println("Enter current PIN:");
	String pin = userInput.nextLine();

	Account account = findAccount(firstName, lastName);
	if (account != null && account.checkPin(pin)) {
	System.out.println("Enter new PIN:");
	String newPin = userInput.nextLine();
	account.changePin(newPin);
	} else {
	System.out.println("Account not found or incorrect PIN.");
	}
	}

	private static Account findAccount(String firstName, String lastName) {
	for (Account account : accounts) {
	if (account.getFirstName().equals(firstName) && account.getLastName().equals(lastName)) {
	return account;
	}
	}
	return null;
	}
}

class Account {
	private String firstName;
	private String lastName;
	private String pin;
	private double balance;

	public Account(String firstName, String lastName, String pin, double initialBalance) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.pin = pin;
	this.balance = initialBalance;
	}

	public String getFirstName() {
	return firstName;
	}

	public String getLastName() {
	return lastName;
	}

	public boolean checkPin(String pin) {
	return this.pin.equals(pin);
	}

	public double getBalance() {
	return balance;
	}

	public void deposit(double amount) {
	balance += amount;
	System.out.println("Deposit successful. New balance: " + balance);
	}

	public void withdraw(double amount) {
	if (amount <= balance) {
	balance -= amount;
	System.out.println("Withdrawal successful. New balance: " + balance);
	} else {
	System.out.println("Insufficient funds.");
	}
	}

	public void transfer(Account recipient, double amount) {
	if (amount <= balance) {
	balance -= amount;
	recipient.deposit(amount);
	System.out.println("Transfer successful. New balance: " + balance);
	} else {
	System.out.println("Insufficient funds.");
	}
	}

	public void changePin(String newPin) {
	pin = newPin;
	System.out.println("PIN changed successfully.");
	}
}
