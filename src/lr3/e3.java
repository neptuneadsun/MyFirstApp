package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности");

        int size = id.nextInt();

        int[] nums = new int[size];

        if (size >= 1) nums[0] = 1;
        if (size >= 2) nums[1] = 1;

        for (int i = 2 ; i < nums.length ; i++) {
            nums[i] = nums[i-1] + nums[i-2];

        }

        // то же самое, но с while
//        int i = 0;
//        while (i < nums.length) {
//            if (i == 0 || i == 1) {
//                nums[i] = 1;
//            } else {
//                nums[i] = nums[i-1] + nums[i-2];
//            }
//            i++;
//        }

        System.out.println("Последовательность Фибоначчи: " + Arrays.toString(nums));
    }
}
