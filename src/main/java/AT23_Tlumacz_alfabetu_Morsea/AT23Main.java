package AT23_Tlumacz_alfabetu_Morsea;

public class AT23Main {
    public static void main(String[] args) {
        String morseText = ".- -.. .- --";
        System.out.println(MorseTranslator.translateFromMorse(morseText));
        String morseText2 = "-.- --- -.. .. .-.. .-.. .-";
        System.out.println(MorseTranslator.translateFromMorse(morseText2));
    }
}
