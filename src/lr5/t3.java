package lr5;

public class t3 {
    int num1;
    int num2;

    public t3() {
        this.num1 = 0;
        this.num2 = 0;
        System.out.println("Без аргументов: " + num1 + ", " + num2);
    }

    public t3(int num) {
        this.num1 = num;
        this.num2 = num;
        System.out.println("С одним аргументом: " + num1 + ", " + num2);
    }

    public t3(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("С двумя аргументами: " + num1 + ", " + num2);
    }

    public void printValues() {
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }

    public static void main(String[] args) {
        System.out.println("Конструктор без аргументов:");
        t3 obj1 = new t3();
        obj1.printValues();

        System.out.println("Конструктор с одним аргументом:");
        t3 obj2 = new t3(10);
        obj2.printValues();

        System.out.println("Конструктор с двумя аргументами:");
        t3 obj3 = new t3(20, 30);
        obj3.printValues();
    }
}
