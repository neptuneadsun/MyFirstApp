package lr7.ex5;

public class SuperClass {
    private String str1;

    //конструктор с текстовым параметром
    public SuperClass(String str1) {
        this.str1 = str1;
    }

    //метод
    public void displayClass() {
        System.out.println("Class: " + this.getClass().getSimpleName());
        System.out.println("str1 = " + str1);
    }
}
