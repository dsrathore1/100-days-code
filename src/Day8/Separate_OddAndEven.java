package Day8;

import java.util.ArrayList;
import java.util.Collections;

public class Separate_OddAndEven {
    public static void separateFun(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int j = 0; j <= arr.length - 1; j++) {
            if (arr[j] % 2 == 0) {
                arr1.add(arr[j]);
            } else {
                arr2.add(arr[j]);
            }
        }

        int pos = 0;
        System.out.println("Your even no. arr :- ");
        Collections.sort(arr1);
        for (int m : arr1) {
            arr[pos] = m;
            pos++;
            System.out.print(m + " ");
        }
        System.out.println("\nYour odd no. arr :- ");
        Collections.sort(arr2);
        for (int k : arr2) {
            arr[pos] = k;
            pos++;
            System.out.print(k + " ");
        }
        System.out.println("\nThe final separated array is :- ");
        for (int o : arr) {
            System.out.print(o + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 8, 9, 7, 3, 12, 54, 32, 121};
        separateFun(arr);
    }
}
