import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class DateDifferenceTest {
    @Test
    public void dateDifferenceTest() {
        LocalDate firstDate = LocalDate.of(2005, Month.MAY, 12);
        LocalDate secondDate = LocalDate.of(2000, Month.MAY, 2);

        StringBuilder builder = new StringBuilder("5 лет 0 месяцев 10 дней");

        assertTrue(builder.toString().equals(DateDifference.dateComparison(firstDate, secondDate).toString()));
    }
}