import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {
    @Test
    void testSetNumberOfRows() {
        int expected = 4;
        PascalsTriangle.setNumberOfRows(4);

        assertEquals(expected, PascalsTriangle.numberOfRows);
    }
}