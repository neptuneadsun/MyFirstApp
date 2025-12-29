package lr7.ex4;

public class SuperClass {
    public char ch1;

    public SuperClass(char ch1) {
        this.ch1 = ch1;
    }

    @Override
    public String toString() {
        return "SuperClass ch1 = " + ch1;
    }
}
