package lr7.ex3;

public class SuperClass {
    public int num1;

    //метод
    public void setValues(int num1) {
        this.num1 = num1;
    }

    //конструктор
    public SuperClass(int num1) {
        this.num1 = num1;
    }

    @Override
    public String toString() {
        return "SuperClass num1 = " + num1;
    }
}
