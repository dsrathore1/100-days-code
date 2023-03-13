package Day4;

import java.util.Scanner;

//? Take a matrix as an input from the user. Search for a number x and print the indices at which it occurs
public class FindAnElement {
    public static void targetElement(int[][] arr, int target, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == target) {
                    System.out.print("Your element is present on Row :- " + (i) + " Col :- " + (j));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows :- ");
        int rows = sc.nextInt();
        System.out.print("\nEnter the no. of column :- ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the Matrix :- ");
        //! Taking a INPUT
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the target :- ");
        int target = sc.nextInt();
        targetElement(arr, target, rows, cols);
    }

}
