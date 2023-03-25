package Day9;

public class DutchNationalFlag {
    public static void solution(int[] arr) {
        int mid = 0, low = 0, high = arr.length - 1;
        while (mid < high) {
            switch (arr[mid]) {
                case 0 -> {
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    mid++;
                    low++;
                }
                case 1 -> mid++;
                case 2 -> {
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2, 0, 1, 2, 1, 0, 2, 2, 2, 1, 0};
        solution(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
