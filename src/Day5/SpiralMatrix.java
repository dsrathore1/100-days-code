package Day5;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> printMatrix(int[][] arr, int row, int col) {
        int l = 0, r = col - 1, b = row - 1, t = 0, dir = 0;
        List<Integer> list = new ArrayList<>();
        if (row == 0) return list;

        while (t <= b && l <= r) {
            if (dir == 0) {
                for (int i = l; i <= r; i++) {
                    list.add(arr[t][i]);
                }
                t++;
                dir = 1;
            } else if (dir == 1) {
                for (int i = t; i <= b; i++) {
                    list.add(arr[i][r]);
                }
                r--;
                dir = 2;
            } else if (dir == 2) {
                for (int i = r; i >= l; i--) {
                    list.add(arr[b][i]);
                }
                b--;
                dir = 3;
            } else {
                for (int i = b; i >= t; i--) {
                    list.add(arr[i][l]);
                }
                l++;
                dir = 0;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = arr.length;
        int col = arr[0].length;

        //! Print the 2D array
        for (int[] ints : arr) {
            for (int j = 0; j < col; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        //! Function for Spiral Matrix
        List<Integer> ans = printMatrix(arr, row, col);
        System.out.println(ans);
    }
}
