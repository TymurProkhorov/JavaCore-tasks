
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class TramTicketsTest {

@Test
    void ticketTest(){
    List<String> list = TramTickets2.tickets();
    String actual = list.get(0);
String expected = "000000";
    assertEquals(expected, actual);
}
}
