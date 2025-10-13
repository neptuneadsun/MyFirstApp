package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Название месяца: ");
        String month = in.nextLine();

        System.out.println("Число дней в нем: ");
        int date = in.nextInt();

        System.out.println("В " + month + " " + date + " дней");


        in.close();

    }
}