package Timus.task_1076;

import java.util.*;

public class m6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;  // весь мусор
        int saved = 0;  // сколько можно не трогать

        for (int i = 0; i < n; i++) {
            int maxInRow = 0;
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                total += x;
                if (x > maxInRow) maxInRow = x;
            }
            saved += maxInRow;
        }

        System.out.println(total - saved);
    }
}
