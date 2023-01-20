package AT20_Konwerter_liczby_dziesietnej_na_binarna;

public class AT20Main {

    public static void main(String[] args) {
        BinaryConverter binaryConverter = new BinaryConverter();
        int number = 2;
        System.out.println("Decimal: " + number + ", binary: " + binaryConverter.convertToBinary(number));
    }
}
