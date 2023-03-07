package Day2;

public class ReverseArray {
    public static void reverseFunc(int[] arr) {
        System.out.println("Before reverse the array :- ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nAfter reverse the array :- ");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 5, 7, 82, 1, 42};
        reverseFunc(arr);
    }
}
