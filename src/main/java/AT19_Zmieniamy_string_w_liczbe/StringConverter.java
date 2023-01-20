package AT19_Zmieniamy_string_w_liczbe;

public class StringConverter {

    public static int convertToInt(String string) {
        int result;
        try {
            result = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("Cannot convert: " + e.getMessage());
            throw new IllegalArgumentException();
        }
        return result;
    }
}
