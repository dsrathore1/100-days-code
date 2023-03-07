package Day2;

public class ReverseString {
    public static String reverseWord(String str) {
        String[] a = str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Before reverse the string :- ");
        for (String s : a) {
            System.out.print(s);
        }

        System.out.println("\nAfter reverse the string :- ");
        for (int k = a.length - 1; k >= 0; k--) {
            stringBuilder.append(a[k]);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "Geeks";
        String ans = reverseWord(s);
        System.out.println(ans);
    }
}
