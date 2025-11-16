package lr4;

public class t2 {
    public static void main(String[] args) {
        int height = 10;
        int i;
        int j;
        int z;

        for (i = 1; i <= height; i++) {
            System.out.print("номер строки " + i + " ");
            z = 0;

            for (j = height - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
