package AT21_Konwerter_liczby_dziesietnej_na_szesnastkowa;

import java.util.List;

public class AT21Main {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 48, 64, 80, 96, 112, 128, 144, 160, 176, 192, 208, 224, 240, 256, 512, 768, 1024);
        HexaConverter hexaConverter = new HexaConverter();

        for (Integer number : numbers) {
            System.out.println("Decimal: " + number + ", hexadecimal: " + hexaConverter.convertToHexadecimal(number));
        }
    }
}
