package Day8;

import java.util.HashSet;

public class DuplicateNumber {
    public static boolean method1(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean method2(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (hs.contains(arr[i])) {
                return true;
            } else {
                hs.add(arr[i]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 6, 3, 5, 8, 3};
        int[] arr2 = {4, 3, 5, 6, 7, 2, 4};
        System.out.println(method1(arr));
        System.out.println(method2(arr2));
    }
}
