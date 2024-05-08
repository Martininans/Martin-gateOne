import java.util.*;
public class TaskNine{
	public static void main(String... args){
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	for(int i = 0; i < 10; i++){
		System.out.print("Enter scores (between 0 & 100)" );
		int scores = scan.nextInt();
		sum += scores;
	}
	int average = sum / 10;
	System.out.print("the sum is: "  + sum );
	System.out.print("the average is: "  + average );
}
}