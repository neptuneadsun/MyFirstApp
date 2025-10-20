package Timus.task_1264;

import java.util.Scanner;

public class m4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int numM = m + 1;
        int result = n * numM;

        System.out.println(result);
    }
}
