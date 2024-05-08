import java.util.Random;
import java.util.Scanner;

public class ArithmeticQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswers = 0;
	int failed = 0;
	int passed = 0;
        System.out.println("Attempt Arithmetic Quiz!");
	
        for (int i = 1; i <= 10; i++) {
            int num1 = random.nextInt(1000); 
            int num2 = random.nextInt(1000);
            int operator = random.nextInt(4);
           
           System.out.print(num1 + "+"  + num2 + "=");
	int answer = scanner.nextInt();
	 if(answer == num1 + num2){
	 passed += 1;
} else{
	 failed += 1;
}
}
	System.out.println("number passed is " + passed);
	System.out.print("number failed is " + failed);
}
}