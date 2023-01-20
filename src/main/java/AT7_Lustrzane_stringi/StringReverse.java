package AT7_Lustrzane_stringi;

public class StringReverse {

    public static String reverseString(String input) {

        StringBuilder builder = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            builder.append(input.charAt(i));
        }

        return builder.toString();
    }
}
