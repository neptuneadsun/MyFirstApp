package lr7.ex4;

public class Main {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass('A');
        SubClassA obj2 = new SubClassA('B', "textB");
        SubClassB obj3 = new SubClassB('C', "textC", 1);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
