package lr4;

import java.util.Random;

public class t5 {
    public static void main(String[] args) {
        int oRows = 3;
        int oColumn = 5;
        int i;
        int j;

        Random random = new Random();

        int[][] original = new int[oRows][oColumn];

        System.out.println("Исходный массив " + oRows + "x" + oColumn + " ");
        for (i = 0; i < oRows; i++) {
            for (j = 0; j < oColumn; j++) {
                original[i][j] = random.nextInt(100);
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }

        int[][] trans = new int[oColumn][oRows];

        for (i = 0; i < oRows; i++) {
            for (j = 0; j < oColumn; j++) {
                trans[j][i] = original[i][j];
            }
        }

        System.out.println("Обратный массив " + oColumn + "x" + oRows + " ");
        for (i = 0; i < oColumn; i++) {
            for (j = 0; j < oRows; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
