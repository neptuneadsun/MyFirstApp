package Timus.task_1893;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int row = in.nextInt();
        String seat = in.next();
        char letter = seat.charAt(0);

        // Верхняя палуба (ряды 1-20)
        if (row >= 1 && row <= 20) {
            // Премиум-класс (ряды 1-2): места A, B, C, D
            if (row <= 2) {
                if (letter == 'A' || letter == 'D') {
                    System.out.println("window");
                } else if (letter == 'B' || letter == 'C') {
                    System.out.println("aisle");
                } else {
                    System.out.println("neither");
                }
            }
            // Бизнес-класс (ряды 3-20): места A, B, C, D, E, F
            else {
                if (letter == 'A' || letter == 'F') {
                    System.out.println("window");
                } else if (letter == 'C' || letter == 'D') {
                    System.out.println("aisle");
                } else {
                    System.out.println("neither");
                }
            }
        }

        // Нижняя палуба (ряды 21-65)
        else if (row >= 21 && row <= 65) {
            if (letter == 'A' || letter == 'K') {
                System.out.println("window");
            } else if (letter == 'C' || letter == 'D' || letter == 'G' || letter == 'H') {
                System.out.println("aisle");
            } else {
                System.out.println("neither");
            }
        }
        else {
            System.out.println("neither");
        }
    }
}
