package AT1_szybka_podmianka;

public class AT1Main {

    public static void main(String[] args) {

        ValueSwitcher valueSwitcher = new ValueSwitcher(5, 7);

        System.out.println("a= " + valueSwitcher.getA() + ", b= " + valueSwitcher.getB());
        valueSwitcher.switchValues();

        System.out.println("a= " + valueSwitcher.getA() + ", b= " + valueSwitcher.getB());
    }
}
