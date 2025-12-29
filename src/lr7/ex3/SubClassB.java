package lr7.ex3;

public class SubClassB extends SubClassA {
    public String str1;

    // метод с тремя
    public void setValues(int num1, char ch1, String str1) {
        super.setValues(num1, ch1);
        this.str1 = str1;
    }

    // конструктор с тремя
    public SubClassB(int num1, char ch1, String str1) {
        super(num1, ch1);
        this.str1 = str1;
    }

    @Override
    public String toString() {
        return "SubClassB num1 = " + num1 + ", ch1 = " + ch1 + ", str1 = " + str1;
    }
}
