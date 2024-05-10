import java.util.Scanner;

public class Tax1{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
	System.out.print("Enter card number: ");
	String cardNumber = scanner.nextLine();

	int CARDNUMBER = 16;
	
	if(cardNumber.length() == CARDNUMBER ){
		System.out.print( valid card number);
	}else{
		System.out.print(invalid card number);		
	}

	char firstNumber = cardNumber.charAt(0);
	char four = 4;
	char five = "5";
	char six = "6";
	
	if (firstNumber != four || firstNumber != five ||firstNumber != six){
	System.out.print(cardNumber, + "is invalid");
	}else{
	System.out.printf(cardNumber, +  "is valid");
	}
}
}