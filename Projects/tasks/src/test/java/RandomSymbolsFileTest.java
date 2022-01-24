import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OptimizedCharsInStringTest {
    @Test
    void test() {
        File file = new File("src/main/java/TestFile.txt");
        Map<Character, Long> map = RandomSymbolsFile12.charactersCount(file);
        Map<Character, Long> mapTest = new HashMap<>();
        assertEquals(mapTest, map);
    }
}