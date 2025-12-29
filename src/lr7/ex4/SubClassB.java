package lr7.ex4;

public class SubClassB extends SubClassA {
    public int num1;

    public SubClassB(char ch1, String str1, int num1) {
        super(ch1, str1);
        this.num1 = num1;
    }

    @Override
    public String toString() {
        return "SubClassB ch1 = " + ch1 + ", str1 = " + str1 + ", num1 = " + num1;
    }
}
