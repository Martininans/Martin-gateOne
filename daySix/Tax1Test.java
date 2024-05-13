import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tax1Test {

    @Test
    public void testCalculateAge() {
        int age1 = Tax1.calculateAge("19-02-1992");
        assertEquals(32, age1);

        int age2 = Tax1.calculateAge("20-05-1990");
        assertEquals(33, age2);

        int age3 = Tax1.calculateAge("13-05-1990");
        assertEquals(34, age3);
    }
}
