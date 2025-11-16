package lr4;

public class t3 {
    public static void main(String[] args) {
        int rows = 10;
        int column = 15;
        int i;
        int j;

        int[][] array = new int[rows][column];

        for (i = 0; i < rows; i++) {
            for (j = 0; j < column; j++) {
                array[i][j] = 2;
            }
        }

        for (i = 0; i < rows; i++) {
            System.out.print("Строка " + (i + 1) + " ");
            for (j = 0; j < column; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println(" Количество элементов " + column);
        }
    }
}
