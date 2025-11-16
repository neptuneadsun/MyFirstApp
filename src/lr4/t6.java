package lr4;

import java.util.Random;

public class t6 {
    public static void main(String[] args) {
        int rows = 4;
        int column = 6;
        int i;
        int j;

        Random random = new Random();

        int[][] originalArray = new int[rows][column];
        System.out.println("Исходный массив " + rows + "x" + column + " ");

        for (i = 0; i < rows; i++) {
            for (j = 0; j < column; j++) {
                originalArray[i][j] = i * 10 + j;
                System.out.print(originalArray[i][j] + " ");
            }
            System.out.println();
        }

        int rowToRemove = random.nextInt(rows);
        int colToRemove = random.nextInt(column);

        System.out.println("Удаляем строку " + (rowToRemove + 1) + " столбец " + (colToRemove + 1));

        int[][] newArray = new int[rows - 1][column - 1];

        int newI = 0;
        for (i = 0; i < rows; i++) {
            if (i == rowToRemove) {
                continue;
            }

            int newJ = 0;
            for (j = 0; j < column; j++) {
                if (j == colToRemove) {
                    continue;
                }

                newArray[newI][newJ] = originalArray[i][j];
                newJ++;
            }
            newI++;
        }

        System.out.println("Новый массив " + (rows - 1) + "x" + (column - 1) + " ");
        for (i = 0; i < newArray.length; i++) {
            for (j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
