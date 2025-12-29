package lr7.ex5;

public class SubClassA extends SuperClass {
    protected int num1;

    public SubClassA(String str1, int num1) {
        super(str1);
        this.num1 = num1;
    }

    @Override
    public void displayClass() {
        super.displayClass();
        System.out.println("num1 = " + num1);
    }
}
