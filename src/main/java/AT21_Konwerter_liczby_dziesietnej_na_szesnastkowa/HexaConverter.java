package AT21_Konwerter_liczby_dziesietnej_na_szesnastkowa;

public class HexaConverter {

    static final int HEXA = 16;

    public String convertToHexadecimal(int decimal) {

        if (decimal == 0) {
            return "0";
        }

        StringBuilder builder = new StringBuilder();
        int tempNumber = decimal;
        int rest;

        while (tempNumber > 0) {
            rest = tempNumber % HEXA;
            builder.append(convertToChar(rest));
            tempNumber = tempNumber / 16;
        }
        return builder.reverse().toString();
    }

    public String convertToChar(int number) {
        return switch (number) {
            case 10 -> "A";
            case 11 -> "B";
            case 12 -> "C";
            case 13 -> "D";
            case 14 -> "E";
            case 15 -> "F";
            default -> String.valueOf(number);
        };

    }
}
