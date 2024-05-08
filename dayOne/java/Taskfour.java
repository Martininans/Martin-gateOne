import java.util.*;
public class Taskfour{
	public static void main(String... args){
	Scanner scan = new Scanner(System.in);
	int sumOfEven = 0;
	
	for(int i = 0; i < 10; i++){
		System.out.print("Enter scores: " );
		int scores = scan.nextInt();
		if(i % 2 == 0);{
		sumOfEven += i;
	}
}
	int average = sumOfEven / 10;
	System.out.print("the sum of even index  is: "  + sumOfEven);
}
}