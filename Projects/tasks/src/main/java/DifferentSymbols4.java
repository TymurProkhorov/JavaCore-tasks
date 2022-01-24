import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DifferentSymbols4 {
    public static void main(String[] args) {
        System.out.println(uniqueWord("fffff ab f 1234 jkjk"));
    }

    public static String uniqueWord(String s) {
        if (s == null) {
            return null;
        }
        String[] strings =s.split(" ");
        String resultString = strings[0];
        int res = new HashSet<>(Arrays.asList(strings[0].split(""))).size();
        for (String string : strings) {
            Set<String> set = new HashSet<>(Arrays.asList(string.split("")));
            if (res > set.size()) {
                res = set.size();
                resultString = string;
            }
        }
        return resultString;
    }

}
