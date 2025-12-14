package Timus.task_1142;

import java.util.Scanner;

public class m12 {
    private static void calc(long[] res) {
        res[0] = 1;
        res[1] = 1;

        for (int n = 2; n <= 10; n++) {
            res[n] = 0;
            for (int k = 1; k <= n; k++) {
                long comb = comb(n, k);
                res[n] += comb * res[n - k];
            }
        }
    }

    private static long comb(int n, int k) {
        if (k > n)
        return 0;

        if (k == 0 || k == n)
        return 1;

        if (k > n - k) {
            k = n - k;
        }

        long res = 1;
        for (int i = 1; i <= k; i++) {
            res = res * (n - k + i) / i;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] res = new long[11];
        calc(res);

        while (true) {
            int N = sc.nextInt();
            if (N == -1) {
                break;
            }
            System.out.println(res[N]);
        }

        sc.close();
    }
}
