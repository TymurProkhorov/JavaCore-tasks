import java.util.ArrayList;
import java.util.List;

public class TramTickets2 {
    public static void main(String[] args) {
        List<String> test = tickets();
        System.out.println(test);
    }

    public static List<String> tickets() {
        List<String> ticketNumbers = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i <= 999999; i++) {
            int digit1 = i / 100000;
            int digit2 = (i % 100000) / 10000;
            int digit3 = (i % 10000) / 1000;
            int digit4 = (i % 1000) / 100;
            int digit5 = (i % 100) / 10;
            int digit6 = i % 10;

            if (digit1 + digit2 + digit3 == digit4 + digit5 + digit6) {
                sum++;
                String luckyTicket = String.format("%06d", i);
                ticketNumbers.add(luckyTicket);
            }
        }

        return ticketNumbers;
    }

}
