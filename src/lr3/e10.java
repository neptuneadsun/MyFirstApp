package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class e10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = id.nextInt();

        int[] nums = new int[size];
        Random random = new Random();


        System.out.println("Готовый массив: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        Arrays.sort(nums);

        System.out.println("Сортировка по убыванию: ");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
