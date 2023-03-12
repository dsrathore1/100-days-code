package Day2;

import java.util.Arrays;

public class Sort {
    public static void ascendingOrder(int[] arr) {
        //! Using already available package
//        Arrays.sort(arr);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

        //! Using For Loop
//        for (int j = 0; j <= arr.length; j++) {
//            for (int k = j + 1; k <= arr.length - 1; k++) {
//                if (arr[j] >= arr[k]) {
//                    int temp = arr[j];
//                    arr[j] = arr[k];
//                    arr[k] = temp;
//                }
//            }
//        }

        //! Selection Sort


        for (int m = 0; m <= arr.length; m++) {
            int min = m;
            for (int n = m + 1; n <= m - 1; n++) {
                if (arr[n] < arr[min]) {
                    min = n;
                }
                int temp = arr[min];
                arr[min] = arr[m];
                arr[m] = temp;
            }
        System.out.print(Arrays.toString(arr));
        }

    }

    public static void main(String[] args) {
        int[] arr = {0, 23, 14, 12, 9};
        ascendingOrder(arr);
    }
}
