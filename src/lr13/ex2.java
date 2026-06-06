package lr13;

// В программе, где требуется из матрицы вывести столбец с номером, заданным с
//клавиатуры, могут возникать ошибки в следующих случаях:
//– ввод строки вместо числа;
//– нет столбца с таким номером.

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите номер столбца (от 1 до " + matrix[0].length + "): ");
            int col = Integer.parseInt(sc.nextLine()) - 1;
            if (col < 0 || col >= matrix[0].length) {
                throw new RuntimeException("Нет столбца с таким номером");
            }
            System.out.println("Столбец " + (col + 1) + ":");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][col]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: ввод строки вместо числа");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("Завершение работы");
        }
    }
}
