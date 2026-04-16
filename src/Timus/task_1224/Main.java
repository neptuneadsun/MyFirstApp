package Timus.task_1224;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int result;

        if (n <= m) {
            result = 2 * n - 2;
        } else {
            result = 2 * m - 1;
        }

        if (result < 0) result = 0;

        System.out.println(result);
    }
}
