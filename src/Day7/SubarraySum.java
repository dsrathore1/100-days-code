package Day7;

import java.util.ArrayList;

public class SubarraySum {
    static Integer subArraySumFun(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[i] + arr[j] == s) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        return list.get(-1) ;
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 7, 8, 4, 3, 2, 5, 3, 4};
        int n = arr.length;
        int s = 9;

        System.out.println(subArraySumFun(arr, n, s));
    }
}
