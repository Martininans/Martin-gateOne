import java.util.Scanner;

public class Tax1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[3][3];

       
	
	for (int counter = 0; counter < 3; counter++) {
	for (int count = 0; count < 3; count++) {
	System.out.println("Enter characters (x or o):");
	matrix[counter][count] = scanner.next().charAt(0);
            
        }
}
	for (int counter = 0; counter < 3; counter++) {
	for (int count = 0; count < 3; count++) {
	System.out.print(matrix[counter][count] + " ");
            }
            System.out.println();
        }
    }
}
