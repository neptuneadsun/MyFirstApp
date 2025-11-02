package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class e6 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int size = id.nextInt();

        int[] nums = new int[size];
        int i = 0;
        int n = 0;

        if (size <= 0) {
            System.out.println("Введено некорректное значение для размера массива");
        }

        do {
            if (n % 5 == 2) {
                System.out.println(n);
                nums[i] = n;
                i++;
            }
            n++;
        } while (i < size);

        System.out.println(Arrays.toString(nums));
    }
}
