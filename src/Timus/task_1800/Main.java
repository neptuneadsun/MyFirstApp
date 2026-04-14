package Timus.task_1800;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        int h = in.nextInt();
        int omega = in.nextInt();

        double g = 9.81;
        double t = Math.sqrt(2.0 * h / 100.0 / g);
        double w = omega * 2 * Math.PI / 60.0;
        double angle = w * t;

        int halfTurns = (int)Math.round(angle / Math.PI);

        if (halfTurns % 2 == 0) {
            System.out.println("butter");
        } else {
            System.out.println("bread");
        }
    }
}
