package Timus.task_1585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        int emperor = 0;
        int little = 0;
        int macaroni = 0;

        for (int i = 0; i < n; i++) {
            String penguin = in.nextLine();

            if (penguin.equals("Emperor Penguin")) {
                emperor++;
            } else if (penguin.equals("Little Penguin")) {
                little++;
            } else if (penguin.equals("Macaroni Penguin")) {
                macaroni++;
            }
        }

        if (emperor > little && emperor > macaroni) {
            System.out.println("Emperor Penguin");
        } else if (little > emperor && little > macaroni) {
            System.out.println("Little Penguin");
        } else {
            System.out.println("Macaroni Penguin");
        }
    }
}
