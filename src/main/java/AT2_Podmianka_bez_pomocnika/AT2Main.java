package AT2_Podmianka_bez_pomocnika;

public class AT2Main {

    public static void main(String[] args) {

        ValueSwitcher valueSwitcher = new ValueSwitcher(5, 7);

        System.out.println("a= " + valueSwitcher.getA() + ", b= " + valueSwitcher.getB());
        valueSwitcher.switchValues();
        
        System.out.println("a= " + valueSwitcher.getA() + ", b= " + valueSwitcher.getB());
    }
}
