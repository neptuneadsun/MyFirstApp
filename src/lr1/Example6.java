package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Фамилия: ");
        String surname = in.nextLine();

        System.out.println("Имя: ");
        String name = in.nextLine();

        System.out.println("Отчество: ");
        String father = in.nextLine();

        System.out.println("Hello, " + surname + " " + name + " " + father);

        in.close();

    }
}