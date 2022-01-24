import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DifferentSymbolsTest {
    @Test
    public void difSymbTest(){
        String actual = DifferentSymbols4.uniqueWord("fffff ab f 1234 jkjk");
        String expected = "fffff";
        assertEquals(expected,actual);
    }
    @Test
    public void difSymbTest2(){
        String actual = DifferentSymbols4.uniqueWord(null);
        String expected = null;
        assertEquals(expected,actual);
    }
}
