package Extra;

public class ArrayToString {
    public static void main(String[] args) {
        String[] str = {"one", "two", "three", "four"};
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= str.length - 1; i++) {
            stringBuilder.append(str[i]);
        }
        String joinedString = stringBuilder.toString();
        System.out.println("Converted Array to String :- " + joinedString);
    }
}
