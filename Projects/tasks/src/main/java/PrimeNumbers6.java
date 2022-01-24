

public class PrimeNumbers6 {
    public static void main(String[] args) {
        System.out.println(isSimple(20));
    }
    public static boolean isSimple(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        else if (n > 1 && (n % 2 == 0 || n % 3 == 0)) {
            return false;
        } if (n  > 1 && (n % 2 != 0 || n % 3 != 0)){
            return true;
        }
        return false;
    }
}