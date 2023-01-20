package AT1_szybka_podmianka;

public class ValueSwitcher {

    private int a;
    private int b;

    public void switchValues() {
        System.out.println("Switching values...");
        int c = a;
        a = b;
        b = c;
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
