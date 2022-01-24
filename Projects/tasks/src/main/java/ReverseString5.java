public class ReverseString5 {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverseString(str));
        System.out.println(reverseStringWithoutStringFunctions("abcd"));

    }
    public static String str;
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseStringWithoutStringFunctions(String string){
        char[] charArrayOfGivenString = string.toCharArray();
        String givenString = "";
        for(int i = charArrayOfGivenString.length-1; i>=0; i--){
            givenString = givenString + charArrayOfGivenString[i];
        }
        return givenString;
    }
}
