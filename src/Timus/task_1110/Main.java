package Timus.task_1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int Y = in.nextInt();

        boolean f = false;

        for (int X = 0; X < M; X++) {
            if (Math.pow(X, N) % M == Y) {
                System.out.print(X + " ");
                f = true;
            }
        }

        if (!f) {
            System.out.println(-1);
        }
    }
}
