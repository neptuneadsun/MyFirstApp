package Timus.task_1319;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //размер матрицы и ее создание
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        //переменная для записи чисел
        int num = 1;

        //уровень 0 - . . 1
        for (int level = 0; level < n; level++) {
            for (int i = 0; i <= level; i++) {
                arr[i][n - 1 - level + i] = num++;
            }
        }

        //уровень 1 - . 2 1
        //уровень 1 - . . 3
        for (int level = 1; level < n; level++) {
            for (int i = 0; i < n - level; i++) {
                arr[level + i][i] = num++;
            }
        }

        //уровень 2 - 4 2 1
        //уровень 2 - . 5 3
        //уровень 2 - . . 6



        // Вывод результата
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
