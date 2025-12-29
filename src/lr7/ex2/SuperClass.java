package lr7.ex2;

public class SuperClass {
    private String str1;

    public String getStr1() {
        return str1;
    }

    //метод для присваивания
    public void setField(String str1) {
        this.str1 = str1;
    }

    //Объект суперкласса создается передачей одного текстового аргумента конструктору
    public SuperClass(String str1) {
        this.str1 = str1;
    }

    //метод, который возвращает длину текстовой строки
    public int getLength() {
        if (str1 == null) {
            return 0;
        }
        return str1.length();
    }

    @Override
    public String toString() {
        return "SuperClass str1 = " + str1 + ", length = " + getLength();
    }
}
