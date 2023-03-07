package Day1;

import java.util.Arrays;

// ? Write a program to find a two corresponding largest element
public class Max1AndMax2 {
    //! Using defined sort function
    public static void findFunc(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Your maximum value two elements are :- " + arr[arr.length - 1] + " & " + arr[arr.length - 2]);
        //! Iterate all the sorted elements
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void findFunc2(int[] arr) {
        int ele1 = arr[0];
        int ele2 = arr[1];

        if (ele1 < ele2) {
            int temp = ele1;
            ele1 = ele2;
            ele2 = temp;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > ele1) {
                ele2 = ele1;
                ele1 = arr[i];
            } else if (arr[i] > ele2 && arr[i] != ele1) {
                ele2 = arr[i];
            }

            System.out.println(ele1);
            System.out.println(ele2);
        }

    }
    public static void main(String[] args) {
        int[] arr = {3, 202, 5, 44, 95, 65, 82, 55, 90, 105, 665};
        findFunc(arr);
        findFunc2(arr);
    }
}
