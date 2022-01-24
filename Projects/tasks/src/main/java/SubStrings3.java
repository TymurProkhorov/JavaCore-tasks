import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStrings3 {
    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        List<String> list = versions(str);
        System.out.println(list);
    }

    public static List<String> versions(String str) {
        Pattern pattern = Pattern.compile("Java\\s+\\d+");
        Matcher matcher = pattern.matcher(str);
        String patternString;
        List<String> strings = new ArrayList<>();

        if (strings.equals(null)) {
            return null;
        }

        while (matcher.find()) {
            patternString = matcher.group().replaceAll("\\s+", " ");
            strings.add(patternString);
        }

        if(!(matcher.find(0))){
            return null;
        }
        return strings;
    }
}