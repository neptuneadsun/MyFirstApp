package Timus.task_1146;

import java.util.Scanner;

public class m11 {
    private static int findMaxSubRectangle(int[][] matrix, int N) {
        int maxSum = Integer.MIN_VALUE;

        for (int top = 0; top < N; top++) {
            int[] columnSum = new int[N];

            for (int bottom = top; bottom < N; bottom++) {
                for (int col = 0; col < N; col++) {
                    columnSum[col] += matrix[bottom][col];
                }

                int currentMax = columnSum[0];
                int maxEnding = columnSum[0];

                for (int i = 1; i < N; i++) {
                    maxEnding = Math.max(columnSum[i], maxEnding + columnSum[i]);
                    currentMax = Math.max(currentMax, maxEnding);
                }

                maxSum = Math.max(maxSum, currentMax);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxSum = findMaxSubRectangle(arr, N);

        System.out.println(maxSum);

        sc.close();
    }
}
