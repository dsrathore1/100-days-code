package Day5;

public class PowerOfNumber {
    //! Reverse the number function
    static long ans = 0; //! Declared the var globally

    public static long revFun(long n) {
        //! Using While loop
//        while (n > 0) {
//            ans = ans * 10 + n % 10;
//            n = n / 10;
//        }

        //! Using recursion method
        if (n == 0) return 0;
        if (n > 0) {
            long temp = n % 10;
            ans = ans * 10 + temp;
            revFun(n / 10);
        }
        return ans;
    }

    static long powAns = 0;
    static long mod = 1000000007;

    public static long powFun(long base, long pow) {
        if (base == 0) return 0;
        if (pow == 1) return 1;
        if (pow % 2 == 0) {
            powAns = powFun(base, pow/2);
            return (powAns % mod * powAns % mod) % mod;
        } else {
            powAns = powFun(base, (pow - 1) / 2);
            return (powAns % mod * powAns % mod * base % mod) % mod;
        }
    }

    public static void main(String[] args) {
        long n = 5;
        long rev = revFun(n);
        System.out.println("Your given number is :- " + n);
        System.out.println("Your given number's reverse is :- " + rev);
        System.out.println("Your mod :- " + mod);

        long ans = powFun(n, rev);
        System.out.println("Power of that given number is :- " + ans);

    }
}
