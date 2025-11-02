package lr3;

import java.awt.*;
import java.util.Scanner;

public class e5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите количество чисел в сумме");

        int size = id.nextInt();

        int summ = 0;
        int y = 0;

        int i = 1;
        do {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                summ += i;
                y++;
            }
            i++;
        } while (y < size);
        System.out.println("Сумма всех чисел = " + summ);

//        то же самое с for
//        for (int i = 1; y < size; i++) {
//            if (i % 5 == 2 || i % 3 == 1) {
//                System.out.println(i);
//                summ += i;
//                y++;
//            }
//        }
    }
}
