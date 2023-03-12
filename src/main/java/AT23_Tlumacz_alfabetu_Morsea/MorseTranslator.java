package AT23_Tlumacz_alfabetu_Morsea;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {

    private static final String[] LATIN_ALPHABET = {
            "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4",
            "5", "6", "7", "8", "9", "0",
            ",", ".", "?"};

    private static final String[] MORSE_CODE = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-",
            ".....", "-....", "--...", "---..", "----.", "-----",
            "--..--", ".-.-.-", "..--.."};

    public static String translateFromMorse(String string) {
        StringBuilder result = new StringBuilder();
        String[] letters = string.split(" ");

        for (String letter : letters) {
            result.append(translateLetter(letter));
        }

        return result.toString();
    }

    private static String translateLetter(String string) {
        final Map<String, String> mapping = new HashMap<String, String>();

        for (int i = 0; i < LATIN_ALPHABET.length; i++) {
            mapping.put(MORSE_CODE[i],LATIN_ALPHABET[i]);
        }

        return mapping.get(string);
    }
}
