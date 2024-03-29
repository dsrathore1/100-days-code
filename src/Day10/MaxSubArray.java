package Day10;

public class MaxSubArray {
    public static int maxNum(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxNum(arr));

    }
}
