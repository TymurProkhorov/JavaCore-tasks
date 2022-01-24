import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {
    @Test
    public void reverseStringTest() {
        String actual = ReverseString5.reverseString("qwerty");
        String expected = "ytrewq";
        assertEquals(expected, actual);
    }

    @Test
    public void reverseStringTest2() {
        String actual = ReverseString5.reverseStringWithoutStringFunctions("asdfgh");
        String expected = "hgfdsa";
        assertEquals(expected, actual);
    }
}
