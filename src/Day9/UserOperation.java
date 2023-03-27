package Day9;

import java.util.Scanner;

//? Geek is given an unknown number, so he asked the mentor to help him by giving some random number x and the unknown number is twice a random number that was given by the mentor.
//! Constraint:
//! 1<=x<=100
public class UserOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the test cases :- ");
        int t = sc.nextInt();
        int[] x = new int[t];

        System.out.println("Enter the numbers :- ");
        for (int j = 0; j <= t - 1; j++) {
            x[j] = sc.nextInt();
            x[j] = x[j] * 2;
        }

        System.out.println("Your output after twice :- ");
        for (int k : x) {
            System.out.println(k);
        }

    }
}