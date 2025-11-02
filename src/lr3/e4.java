package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите первое целое число");
        int num1 = id.nextInt();

        System.out.println("Введите второе целое число");
        int num2 = id.nextInt();


        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        for (int i = min ; i <= max; i++) {
            System.out.println(i + " ");

        }

        // тоже самое с while
//        int i = min;
//        while (i <= max) {
//            System.out.println(i + " ");
//            i++;
//        }
    }
}
