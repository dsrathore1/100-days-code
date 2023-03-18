package Day5;

public class BinarySearch {
    public static int findElement(int[] arr, int target) {
        int l = 0;
        int r = arr.length;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] <= target) {
                l = mid + 1;
            } else if (arr[mid] >= target) {
                r = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int ans = findElement(arr, target);
        System.out.println(ans);
    }
}
