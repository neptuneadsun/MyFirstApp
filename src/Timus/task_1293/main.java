package Timus.task_1293;

import java.io.PrintWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int result = n * (a * b) * 2;

        out.println(result);
        out.flush();
    }
}
