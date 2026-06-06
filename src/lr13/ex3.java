package lr13;

// В программе, вычисляющей сумму элементов типа byte одномерного массива,
// вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
//– ввод строки вместо числа;
//– ввод или вычисление значения за границами диапазона типа.

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Введите размер массива: ");
                int n = Integer.parseInt(sc.nextLine());
                int sum = 0;
                System.out.println("Введите число от -128 до 127:");
                for (int i = 0; i < n; i++) {
                    byte b = Byte.parseByte(sc.nextLine());
                    sum += b;
                }
                System.out.println("Сумма элементов: " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: ввод строки вместо числа или число вне диапазона byte");
            } finally {
                sc.close();
                System.out.println("Все");
            }
    }
}
