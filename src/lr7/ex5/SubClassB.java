package lr7.ex5;

public class SubClassB extends SuperClass {
    protected char ch1;

    public SubClassB(String str1, char ch1) {
        super(str1);
        this.ch1 = ch1;
    }

    @Override
    public void displayClass() {
        super.displayClass();
        System.out.println("ch1 = " + ch1);
    }
}
