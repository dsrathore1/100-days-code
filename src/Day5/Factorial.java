package Day5;

public class Factorial {
    public static long fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    //! Recursive way
    public static void main(String[] args) {
        int n = 5;
        long ans = fact(n);
        System.out.println(ans);
    }
}
