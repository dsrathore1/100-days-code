package Day5;

public class ReverseNumber {
    //! Method 1 :- Recursive way
    public static int revNumFun1(int n) {
        if (n < 10) {
            return n;
        } else {
            System.out.print(n % 10);
        }
        return revNumFun1(n / 10);
    }

    //! Method 2 :- Using while loop way
    public static void revNumFun2(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        int n = 5434553;
        int ans = revNumFun1(n);
        System.out.println(ans);
    }
}
