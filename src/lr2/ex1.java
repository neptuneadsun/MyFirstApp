package lr2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();

        if (num % 3 == 0) {
            System.out.println("Число " + num + " делится на 3 без остатка");
        }
        else {
            System.out.println("Число " + num + " НЕ делится на 3 без остатка");
        }

    }
}
