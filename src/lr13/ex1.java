package lr13;

// В программе, вычисляющей среднее значение среди положительных элементов
//одномерного массива (тип элементов int), вводимого с клавиатуры, могут
//возникать ошибки в следующих случаях:
//– ввод строки вместо числа;
//– несоответствие числового типа данных;
//– положительные элементы отсутствуют.

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите размер: ");
            int n = Integer.parseInt(sc.nextLine());
            int sum = 0, count = 0;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(sc.nextLine());
                if (x > 0) {
                    sum += x;
                    count++;
                }
            }
            if (count == 0) throw new RuntimeException("Нет положительных");
            System.out.println("Среднее = " + (double) sum / count);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода числа");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
