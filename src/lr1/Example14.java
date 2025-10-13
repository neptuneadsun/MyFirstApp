package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int x = in.nextInt();

        int a = x - 1;
        int b = x;
        int c = x + 1;
        int d = (a + b + c) * (a + b + c);

        System.out.println(a + " " + b + " " + c + " " + d);


        in.close();

    }
}