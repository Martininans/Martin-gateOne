import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycleApp{

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your last menstrual cycle date (dd-MM-yyyy): ");
        String lastCycleDateStr = userInput.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate lastCycleDate = LocalDate.parse(lastCycleDateStr, formatter);

        System.out.print("Enter your average cycle duration: ");
        String cycleDurationStr = userInput.nextLine();
        int cycleDuration = Integer.parseInt(cycleDurationStr);

        LocalDate nextFlow = calculateNextFlowDate(lastCycleDate, cycleDuration);

        LocalDate safePeriodStart = nextFlow.minusDays(9);
        LocalDate safePeriodEnd = nextFlow.minusDays(1);

        LocalDate fertilityPeriodStart = nextFlow.minusDays(18);
        LocalDate fertilityPeriodEnd = nextFlow.minusDays(10);

        System.out.println("Next flow date: " + nextFlow.format(formatter));
        System.out.println("Safe period: " + safePeriodStart.format(formatter) + " to " + safePeriodEnd.format(formatter));
        System.out.println("Fertility period: " + fertilityPeriodStart.format(formatter) + " to " + fertilityPeriodEnd.format(formatter));
    }

    public static LocalDate calculateNextFlowDate(LocalDate lastCycleDate, int cycleDuration) {
        return lastCycleDate.plusDays(cycleDuration);
    }
}
