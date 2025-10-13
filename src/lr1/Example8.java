package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("День недели: ");
        String week = in.nextLine();

        System.out.println("Название месяца: ");
        String month = in.nextLine();

        System.out.println("Сегодняшнее число: ");
        int date = in.nextInt();

        System.out.println("Сегодня " + week + ", " + date + " " + month);


        in.close();

    }
}