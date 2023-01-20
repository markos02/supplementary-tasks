package AT20_Konwerter_liczby_dziesietnej_na_binarna;

public class BinaryConverter {

    public String convertToBinary(int number) {
        if (number == 0) {
            return "0";
        }
        StringBuilder builder = new StringBuilder();
        int tempNumber = number;
        while (tempNumber > 0) {
            builder.append(tempNumber % 2);
            tempNumber = tempNumber / 2;
        }
        return builder.reverse().toString();
    }
}
