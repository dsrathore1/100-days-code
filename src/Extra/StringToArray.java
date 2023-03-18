package Extra;

public class StringToArray {
    public static void main(String[] args) {
        String str = "ABED";
        String[] arr = str.split("");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]);
        }
    }
}
