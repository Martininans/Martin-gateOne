import java.util.*;
public class Taskfive{
	public static void main(String... args){
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	for(int i = 2; i < 10; i++){
		System.out.print("Enter scores: " );
		int scores = scan.nextInt();
		sum += scores;
	}
	int average = sum / 5;
	System.out.print("the sumOfEven is: "  + sum );
}
}