package lr4;

public class t1 {
    public static void main(String[] args) {
        int width = 23;
        int height = 11;
        int i;
        int j;
        int z;

        for (i = 1; i <= height; i++) {
            System.out.print("номер строки " + i + " ");
            z = 0;
            for (j = 0; j < width; j++) {
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
