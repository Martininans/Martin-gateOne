import java.util.Scanner;
import java.time.LocalDate;
public class MenstoralCycleApp{
	public static void main(String[] arg){
	Scanner userInput = new Scanner(System.in);
	
	int safePeriod = 1;
	int fertilityPeriod = 1;
	int flowDate = 1;
	int ovulationDate = 1;
	
	System.out.print("Enter your last menstrual cycle date (YYYY-MM-DD): ");
	String lastCycleDateString = userInput.nextLine();
	LocalDate lastCycleDate = LocalDate.parse(lastCycleDateString);
	System.out.print("Enter your cycle duration (in days): ");
	int cycleDuration = userInput.nextInt();
	int fertilityPeriod = cycleDuration / 2;
	LocalDate ovulationDate = lastCycleDate.plusDays(fertilityPeriod);
	LocalDate flowDate = lastCycleDate.plusDays(cycleDuration);
	
	System.out.println("Your next ovulation date is: " + ovulationDate);
	System.out.println("Your next menstrual flow date is: " + flowDate);

}
}


