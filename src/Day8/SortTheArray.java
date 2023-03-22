package Day8;

import java.util.Arrays;

public class SortTheArray {
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp1 = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp1;
        return (i + 1);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int p = partition(arr, start, end);
            quickSort(arr, start, p - 1);
            quickSort(arr, p + 1, end);
        }
    }

    public static int[] sortTheArrayFun(int[] arr, int end) {
        int start = 0;
        quickSort(arr, start, end);
        return arr;
    }


    //! Time Complexity is O(nlog(n))
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4, 7, 9, 8};
        int end = arr.length - 1;
        int[] ans = sortTheArrayFun(arr, end);
        System.out.println(Arrays.toString(ans));
    }
}
