package Day3;

import java.util.Arrays;

//! Two Sum
public class TwoSum {
    public static void sum1(int[] arr, int target) {
        //! Method - 1
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.print(i + " " + j);
                    System.out.println();
                }
            }
        }
    }

    public static int[] sum2(int[] arr, int target) {
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 11, 15, 7, 8, 2};
        int target = 9;
        sum1(arr, target);
        int[] ans = sum2(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
