package lr7.ex4;

public class SubClassA extends SuperClass {
    public String str1;

    public SubClassA(char ch1, String str1) {
        super(ch1);
        this.str1 = str1;
    }

    @Override
    public String toString() {
        return "SubClassA ch1 = " + ch1 + ", str1 = " + str1;
    }
}
