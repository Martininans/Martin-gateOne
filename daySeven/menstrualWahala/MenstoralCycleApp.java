import java.util.Scanner;
import java.time.LocalDate;
public class MenstoralCycleApp{
	public static void main(String[] arg){
	Scanner userInput = new Scanner(System.in);
	
	int safePeriod = 1;
	int fertilityPeriod = 1;
	int flowDate = 1;
	
	System.out.print("Your last mestralCycle date: ");
	int lastCycleDate =  userInput.nextInt();

	System.out.print("Enter your cycle duration: ");
	int cycleDuration =  userInput.nextInt();

	fertilityPeriod = cycleDuration / 2;
	safePeriod
}
}


