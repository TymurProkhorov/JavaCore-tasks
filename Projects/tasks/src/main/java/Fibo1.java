import java.util.Arrays;

public class Fibo1 {
    public static void main(String[] args) {
        int[] test = fibo(11);
        System.out.println(Arrays.toString(test));
    }

    public static int[] fibo(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr;
    }
}
