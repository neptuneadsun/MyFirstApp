package lr4;

public class t7 {
    public static void main(String[] args) {
        int size = 9;
        int[][] array = new int[size][size];
        int i, j;
        int counter = 1;

        for (i = 0; i < size; i++) {
            if (i % 2 == 0) {
                for (j = 0; j < size; j++) {
                    array[i][j] = counter++;
                }
            } else {
                for (j = size - 1; j >= 0; j--) {
                    array[i][j] = counter++;
                }
            }
        }

        System.out.println("Массив змейка ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
