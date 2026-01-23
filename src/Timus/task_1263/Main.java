package Timus.task_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        //массив для подсчета голосов
        int[] votes = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int canNumber = sc.nextInt();
            int currentVotes = votes[canNumber];
            votes[canNumber] = currentVotes + 1;
        }

        for (int i = 1; i <= n; i++) {
            double percent = (votes[i] * 100.0) / m;
            System.out.println(percent);
        }
    }
}
