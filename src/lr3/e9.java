package lr3;

import java.util.Random;
import java.util.Scanner;

public class e9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = id.nextInt();

        int[] nums = new int[size];
        Random random = new Random();

        System.out.println("Готовый массив: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }


        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("Минимальное значение: " + min);
        System.out.print("Индексы элементов с минимальным значением: ");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
