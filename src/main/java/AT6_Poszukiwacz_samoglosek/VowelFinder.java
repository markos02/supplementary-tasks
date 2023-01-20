package AT6_Poszukiwacz_samoglosek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelFinder {

    private static final List<Character> VOWELS = Arrays.asList('A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y');

    public static List<Character> findVowels(String input) {

        List<Character> result = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (VOWELS.contains(input.charAt(i))) {
                result.add(input.charAt(i));
            }
        }
        return result;
    }
}
