package Timus.task_1785;

import java.util.Scanner;

public class m3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int mon = in.nextInt();

        if (mon >= 1 && mon <= 4) {
            System.out.println("few");
        }
        else if (mon >= 5 && mon <= 9) {
            System.out.println("several");
        }
        else if (mon >= 10 && mon <= 19) {
            System.out.println("pack");
        }
        else if (mon >= 20 && mon <= 49) {
            System.out.println("lots");
        }
        else if (mon >= 100 && mon <= 249) {
            System.out.println("throng");
        }
        else if (mon >= 250 && mon <= 499) {
            System.out.println("swarm");
        }
        else if (mon >= 500 && mon <= 999) {
            System.out.println("zounds");
        }
        else if (mon >= 1000) {
            System.out.println("legion");
        }

        System.out.flush();
    }
}
