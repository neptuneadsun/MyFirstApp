package lr2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();

        if (num % 5 == 2) {
            System.out.println("Число " + num + " делится на 5 с остатком 2");
        }
        if (num % 7 == 1) {
            System.out.println("Число " + num + " делится на 7 с остатком 1");
        }
        if (num % 5 != 2 && num % 7 != 1) {
            System.out.println("Число " + num + " не подходит ни одному условию");
        }

    }
}
