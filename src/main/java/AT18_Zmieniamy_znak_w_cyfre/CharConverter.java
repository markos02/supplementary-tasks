package AT18_Zmieniamy_znak_w_cyfre;

public class CharConverter {

    public static int convertToInt(char character) {
        int result = Character.getNumericValue(character);
        if (result < 0 || result > 9) throw new IllegalArgumentException("Illegal character");
        return Character.getNumericValue(character);
    }
}
