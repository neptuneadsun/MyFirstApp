package lr7.ex5;

public class Main {
    public static void main(String[] args) {
        System.out.println("SuperClass: ");
        SuperClass superObj = new SuperClass("txt super");
        superObj.displayClass();

        System.out.println("\n SubClassA: ");
        SubClassA objA = new SubClassA("txt sub A", 1);
        objA.displayClass();

        System.out.println("\n SubClassB: ");
        SubClassB objB = new SubClassB("txt sub B", 'A');
        objB.displayClass();

        System.out.println("\n ref SuperClass: ");
        SuperClass ref1 = new SubClassA("ref A", 2);
        SuperClass ref2 = new SubClassB("ref B", 'B');

        ref1.displayClass();
        System.out.println();
        ref2.displayClass();
    }
}
