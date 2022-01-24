import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FiboTest {
    @Test
    public void fiboTest() {
        int[] actual = Fibo1.fibo(5);
        int[] expected = {1, 1, 2, 3, 5};
        assertArrayEquals(expected, actual);
    }
}
