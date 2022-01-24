import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PrimeNumbersTest {
    @Test
    public void primeNumbersTest(){
        boolean actual = PrimeNumbers6.isSimple(23);
        boolean expected = true;
    }

    @Test
    public void primeNumbersTest2(){
        boolean actual = PrimeNumbers6.isSimple(20);
        boolean expected = false;
    }
}
