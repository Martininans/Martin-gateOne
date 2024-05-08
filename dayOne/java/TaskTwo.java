import java.util.*;
public class TaskTwo{
	public static void main(String... args){
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	for(int i = 0; i < 10; i++){
		System.out.print("Enter scores: " );
		int scores = scan.nextInt();
		sum += scores;
	}
	int average = sum / 10;
	System.out.print("the average is: "  + average );
}
}