
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
class LettersInStringTest {
    @Test
    void test() {
        Map<Character, Integer> map = LettersInString8.charactersCount("This is a sting");
        Map<Character, Integer> mapTest = new HashMap<>();
        mapTest.put('a', 1);
        mapTest.put('s', 3);
        mapTest.put('T', 1);
        mapTest.put('t', 1);
        mapTest.put('g', 1);
        mapTest.put('h', 1);
        mapTest.put('i', 3);
        mapTest.put('n', 1);
        assertEquals(mapTest, map);
    }
}