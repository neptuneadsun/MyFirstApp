package lr7.ex2;

public class SubClass extends SuperClass{
    public int num;

    //конструктор
    public SubClass(int num, String str1) {
        super(str1);
        this.num = num;
    }

    //без параметров (перегрузка метода setField)
    public void setField() {
        super.setField("");
        this.num = 0;
    }

    //с текстовым параметром (переопределение метода из суперкласса)
    @Override
    public void setField(String str1) {
        super.setField(str1);
    }

    //с целочисленным параметром (перегрузка)
    public void setField(int numb) {
        this.num = num;
    }

    // Метод с текстовым и целочисленным параметром (перегрузка)
    public void setField(String str1, int number) {
        super.setField(str1); // используем метод суперкласса
        this.num = num;
    }

    @Override
    public String toString() {
        return "SubClass {str1 = '" + getStr1() + "', length = " + getLength() +
                ", number = " + num + "}";
    }
}
