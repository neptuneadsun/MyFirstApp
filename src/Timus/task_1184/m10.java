package Timus.task_1184;

import java.util.*;

public class m10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>[] g = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) g[i] = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int x;
            while ((x = sc.nextInt()) != 0) {
                g[i].add(x);
            }
        }

        for (int i = 1; i <= n; i++) {
            boolean[] v = new boolean[n+1];
            Stack<Integer> s = new Stack<>();
            s.push(i);
            int count = 0;

            while (!s.isEmpty()) {
                int c = s.pop();
                if (!v[c]) {
                    v[c] = true;
                    count++;
                    for (int nb : g[c]) {
                        if (!v[nb]) s.push(nb);
                    }
                }
            }

            if (count == n) System.out.print(i + " ");
        }

        System.out.println("0");
    }
}
