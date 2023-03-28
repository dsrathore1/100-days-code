package Day10;

import java.util.ArrayList;
import java.util.List;

public class Subarray {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0, sum = 0;

        while (j < n) {
            sum += arr[j];
            if (sum > s) {
                while (sum > s) {
                    sum -= arr[i];
                    i += 1;
                }
            }
            if (sum == s) {
                list.add(i + 1);
                list.add(j + 1);
                break;
            }
            j += 1;
        }
        if (list.size() == 0 || s == 0) {
            return new ArrayList<>(List.of(-1));
        }
        return list;
    }

    //! Method 2
    static ArrayList<Integer> subarraySum2(int[] arr, int n, int s) {
        int i, j = 0, sum = 0;
        if (s == 0) {
            return new ArrayList<>(List.of(-1));
        }
        for (i = 0; i <= n - 1; i++) {
            if (sum < s) {
                sum += arr[i];
            }
            if (sum > s) {
                while (sum > s) {
                    sum -= arr[j];
                    j += 1;
                }
            }
            if (sum == s) {
                return new ArrayList<>(List.of(j + 1, i + 1));
            }
        }
        return new ArrayList<>(List.of(-1));
    }

    //! Method 3
//    public static ArrayList<Integer> subArraySum3(int[] arr, int n, int s) {
//        int left = 0;
//        int right = 0;
//        int sum = 0;
//        if (s == 0) {
//            return new ArrayList<>(List.of(-1));
//        }
//        for (int i = 0; i <= n - 1; i++) {
//            if (sum < s) {
//                sum += arr[i];
//                right++;
//            }
//            if (sum > s) {
//                sum -= arr[i];
//                left--;
//            }
//        }
//        return new ArrayList<>(List.of(left, right));
//    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int s = 12;
        int n = 5;
        System.out.println(subarraySum(arr, n, s));
        System.out.println(subarraySum2(arr, n, s));
//        System.out.print(subArraySum3(arr, n, s));

    }
}
