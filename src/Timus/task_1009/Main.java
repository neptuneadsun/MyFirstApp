package Timus.task_1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        //не 0
        long a = K - 1;

        //0
        long b = 0;

        for (int i = 1; i < N; i++) {
            long newB = a;
            long newA = (a + b) * (K - 1);
            a = newA;
            b = newB;
        }

        System.out.println(a + b);
    }
}
