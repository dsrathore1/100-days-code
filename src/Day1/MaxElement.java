package Day1;

import java.util.Arrays;

/*
    ? Write a program to find a max element into the array
 */
public class MaxElement {
    public static int maxElementFun(int[] arr) {
        int largeElement = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > largeElement) {
                largeElement = arr[i];
            }
        }
        return largeElement;
    }

    public static void largestElement(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Your largest element is :- " + arr[arr.length - 1] + " it gives time complexity of O(nLog(n))");
    }

    public static void main(String[] args) {
        int[] arr = {3, 202, 5, 44, 95, 65, 82, 55, 90, 105, 665};
        int ans = maxElementFun(arr);
        System.out.println("Your largest element is :- " + ans + " its gives time complexity of O(n)");

        largestElement(arr);
    }
}
