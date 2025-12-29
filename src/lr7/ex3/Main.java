package lr7.ex3;

public class Main {
    public static void main(String[] args) {

        //SuperClass
        SuperClass obj1 = new SuperClass(1);
        System.out.println("Объект SuperClass: " + obj1);
        obj1.setValues(2);
        System.out.println("После setValues(2): " + obj1);

        //SubClassA
        SubClassA obj2 = new SubClassA(3, 'A');
        System.out.println("Объект SubClass A: " + obj2);
        obj2.setValues(4, 'B');
        System.out.println("После setValues(4, 'B'): " + obj2);

        //SubClassB
        SubClassB obj3 = new SubClassB(5, 'X', "text");
        System.out.println("Объект SubClass B: " + obj3);
        obj3.setValues(6, 'Y', "text text");
        System.out.println("После setValues(6, 'Y', 'text text'): " + obj3);


    }
}
