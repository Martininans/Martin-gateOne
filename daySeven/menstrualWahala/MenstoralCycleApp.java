import java.util.Scanner;
import java.time.LocalDate;
public class MenstoralCycleApp{
	public static void main(String[] arg){
	Scanner userInput = new Scanner(System.in);
	
	int safePeriod = 1;
	int fertilityPeriod = 1;
	int flowDate = 1;
	int ovulationDate = 1;
	
	System.out.print("Your last mestralCycle date: ");
	String lastCycleDate =  userInput.nextLine();
	LocalDate lastCycleDate = LocalDate.parse(lastCycleDate);

	System.out.print("Enter your cycle duration: ");
	int cycleDuration =  userInput.nextInt();

	
	fertilityPeriod = cycleDuration / 2;
	LocalDate ovulationDate = lastCycleDate.plusDays(fertilityPeriod);
	LocalDate flowDate = lastCycleDate.plusDays(cycleDuration);
	System.out.print(flowDate);
}
}


