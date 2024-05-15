import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class Checkout1 {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<>();
        ArrayList<Double> unitPrices = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();

        System.out.println("What is the customer's name: ");
        String customerName = scan.nextLine();

        do {
            System.out.println("What did the user buy? ");
            items.add(scan.nextLine());

            System.out.println("How many pieces? ");
            quantities.add(Integer.parseInt(scan.nextLine()));

            System.out.println("How much per unit? ");
            unitPrices.add(Double.parseDouble(scan.nextLine()));

            System.out.println("Add more items? (yes/no): ");
            String choice = scan.nextLine();
            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        } while (true);

        double subtotal = 0;
        int totalQuantity = 0;

        for (int i = 0; i < items.size(); i++) {
            double price = unitPrices.get(i) * quantities.get(i);
            subtotal += price;
            totalQuantity += quantities.get(i);
        }

        double vatRate = 0.175;
        double vat = subtotal * vatRate;
        double total = subtotal + vat;
        LocalDate currentDate = LocalDate.now();

        System.out.println("Cashier's Name: ");
        String cashierName = scan.nextLine();

	System.out.println("Enter discount: ");
        double discount = scan.nextDouble();
	double discountR = total * discount / 100;

        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("DATE: " + currentDate);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("===================================================");
        System.out.printf("%-20s %-5s %-10s %-10s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < items.size(); i++) {
            String itemName = items.get(i);
            int quantity = quantities.get(i);
            double price = unitPrices.get(i);
            double itemTotal = price * quantity;
            System.out.printf("%-20s %-5d %-10.2f %-10.2f\n", itemName, quantity, price, itemTotal);
        }

        System.out.println("---------------------------------------------------");
        System.out.printf("%-20s %-8d %-8.2f %-8.2f\n", "TOTAL", totalQuantity, subtotal, total);
        System.out.println("---------------------------------------------------");
        System.out.println("Sub total: " + subtotal);
        System.out.println("Discount: " + discount);
        
	System.out.println("Vat @ 17.50%: " + vat);
        System.out.println("===================================================");
        System.out.println("Bill total: " + (total - discountR));
        System.out.println("===================================================");
        System.out.println("THIS IS NOT THE RECEIPT KINDLY PAY:" + (total - discountR));
        System.out.println("===================================================");
   	
	System.out.println("How much did the customer give to you: ");
        double amountPaid = scan.nextDouble();
        double balance = total - amountPaid;

	System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("DATE: " + currentDate);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("===================================================");
        System.out.printf("%-20s %-5s %-10s %-10s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < items.size(); i++) {
            String itemName = items.get(i);
            int quantity = quantities.get(i);
            double price = unitPrices.get(i);
            double itemTotal = price * quantity;
            System.out.printf("%-20s %-5d %-10.2f %-10.2f\n", itemName, quantity, price, itemTotal);
        }

        System.out.println("---------------------------------------------------");
        System.out.printf("%-20s %-8d %-8.2f %-8.2f\n", "TOTAL", totalQuantity, subtotal, total);
        System.out.println("---------------------------------------------------");
        System.out.println("Sub total: " + subtotal);
        System.out.println("Discount: " + discount);
        
	System.out.println("Vat @ 17.50%: " + vat);
	System.out.println("===================================================");
	
       
        System.out.println("Bill total: " + (total - discountR));
	System.out.println("Amount Paid: " + amountPaid);
	System.out.println("Balance: " + balance);
        System.out.println("===================================================");
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
        System.out.println("===================================================");


    }
}
