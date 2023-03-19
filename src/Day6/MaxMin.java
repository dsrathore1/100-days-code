package Day6;

class Sort {
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

    public final void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }
}

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {5, 56, 89, 73, 1, 3, 25, 84, 98, 31, 20};
        Sort s = new Sort();
        s.quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nYour maximum element at :- " + arr[arr.length - 1]);
        System.out.println("Your minimum element is :- " + arr[0]);
    }
}
