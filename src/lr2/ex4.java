package lr2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();

        if (num > 5 && num <= 10) {
            System.out.println("Число " + num + " выполняет условие");
        }
        else {
            System.out.println("Число " + num + " не подходит условию");
        }

    }
}
