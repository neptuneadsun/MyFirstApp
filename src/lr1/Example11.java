package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ваше имя: ");
        String name = in.nextLine();

        System.out.println("Ваш год рождения: ");
        int year = in.nextInt();
        int age = 2025 - year;

        System.out.println("Ваше имя: " + name);
        System.out.println("Ваш возраст: " + age);


        in.close();

    }
}