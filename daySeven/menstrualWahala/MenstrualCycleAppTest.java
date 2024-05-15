import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstrualCycleAppTest {

    @Test
    public void testCalculateNextFlowDate() {

        LocalDate lastCycleDate = LocalDate.of(2024, 5, 1);
        int cycleDuration = 28;
        LocalDate expectedNextFlowDate = LocalDate.of(2024, 5, 29); 

        LocalDate actualNextFlowDate = MenstrualCycleApp.calculateNextFlowDate(lastCycleDate, cycleDuration);


        assertEquals(expectedNextFlowDate, actualNextFlowDate);
    }
}
