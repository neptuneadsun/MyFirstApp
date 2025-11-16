package lr4;

public class t4 {
    public static void main(String[] args) {
        int height = 10;
        int i;
        int j;
        int z;

        char[][] triangleArray = new char[height][];

        for (i = 0; i < height; i++) {
            triangleArray[i] = new char[i + 1];
        }

        for (i = 0; i < height; i++) {
            z = 0;
            for (j = 0; j < triangleArray[i].length; j++) {
                triangleArray[i][j] = '+';
                z = z + 1;
            }
        }

        for (i = 0; i < height; i++) {
            System.out.print("номер строки " + (i + 1) + " ");
            int count = 0;
            for (j = 0; j < triangleArray[i].length; j++) {
                System.out.print(triangleArray[i][j]);
                count++;
            }
            System.out.println(" Количество символов в строке " + count);
        }
    }
}
