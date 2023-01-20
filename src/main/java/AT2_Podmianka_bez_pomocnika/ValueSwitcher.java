package AT2_Podmianka_bez_pomocnika;

public class ValueSwitcher {

    private int a;
    private int b;

    public void switchValues() {
        System.out.println("Switching values...");
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public ValueSwitcher(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
