package Day9;

public class MissingNumber {
    public static int findNum(int[] arr, int n) {
        int expected = ((n + 1) * (n + 2) / 2); // Ca
        for (int num : arr) {
            expected -= num;
        }
        return (expected);
    }

    public static void main(String[] args) {
        int[] arr = {2};
        int n = arr.length;
        System.out.println(findNum(arr, n));

    }
}
