package AT19_Zmieniamy_string_w_liczbe;

public class AT19Main {
    public static void main(String[] args) {
        String string1 = "2040";
        String string2 = "(";

        System.out.println(StringConverter.convertToInt(string1));
        System.out.println(StringConverter.convertToInt(string2));
    }
}
