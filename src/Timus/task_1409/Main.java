package Timus.task_1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Гарри не прострелил " + (10-a) + " банок");
        System.out.println("Ларри не прострелил " + (10-b) + " банок");
    }
}
