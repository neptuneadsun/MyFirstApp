package Timus.task_1176;

import java.util.*;

public class m9 {
    static int N, A;
    static boolean[][] exist;
    static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        A = sc.nextInt();

        exist = new boolean[N + 1][N + 1];


        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int val = sc.nextInt();
                exist[i][j] = (val == 1);
            }
        }

        List<Integer>[] needToBuild = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            needToBuild[i] = new ArrayList<>();
            for (int j = 1; j <= N; j++) {
                if (i != j && !exist[i][j]) {
                    needToBuild[i].add(j);
                }
            }
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(A);

        int[] currentIndex = new int[N+1];

        while (!stack.isEmpty()) {
            int u = stack.peek();

            if (currentIndex[u] < needToBuild[u].size()) {
                int v = needToBuild[u].get(currentIndex[u]);
                currentIndex[u]++;

                result.add(u + " " + v);

                stack.push(v);
            } else {
                stack.pop();
            }
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}