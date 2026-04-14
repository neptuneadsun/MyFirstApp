package Timus.task_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt(); //машины
        int n = in.nextInt(); //минуты

        int queue = 0; //машины в пробке

        for (int i = 0; i < n; i++) {
            int a = in.nextInt(); //сколько машин подъехало за эту минуту

            queue = queue + a; //машины +
            queue = queue - k; //k машин повернуло

            if (queue < 0) {
                queue = 0;
            }
        }

        System.out.println(queue);
    }
}
