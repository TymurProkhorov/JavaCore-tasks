import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubStringsTest {
    @Test
    void subStringTest() {
        List<String> actual = SubStrings3.versions("Versions: Java  5, Java 6, Java   7, Java 8, Java 12.");
        List<String> expected = new ArrayList<String>(Arrays.asList("Java 5","Java 6", "Java 7", "Java 8", "Java 12"));
        assertEquals(expected, actual);
    }

    @Test
    void subStringTest2() {
        List<String> actual = SubStrings3.versions("qwejhgngdkjhn84568uh uhti ");
        List<String> expected = null;
        assertEquals(expected, actual);
    }
}