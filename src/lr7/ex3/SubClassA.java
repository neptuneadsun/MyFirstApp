package lr7.ex3;

public class SubClassA extends SuperClass {
    public char ch1;

    // метод с двумя
    public void setValues(int num1, char ch1) {
        super.setValues(num1);
        this.ch1 = ch1;
    }

    // конструктор с двумя
    public SubClassA(int num1, char ch1) {
        super(num1); // вызываем конструктор суперкласса
        this.ch1 = ch1;
    }

    @Override
    public String toString() {
        return "SubClassA num1 = " + num1 + ", ch1 = " + ch1;
    }
}
