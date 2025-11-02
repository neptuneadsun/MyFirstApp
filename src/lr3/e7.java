package lr3;

public class e7 {
    public static void main(String[] args) {
        int size = 10;

        char[] symb = new char[size];
        char let = 'a';

        for (int i = 0; i < size; i++) {
            symb[i] = let;
            let += 2;
        }

        System.out.println("Прямо: ");
        for (int i = 0; i < size; i++) {
            System.out.print(symb[i] + " ");
        }
        System.out.println();

        System.out.println("Обратно: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(symb[i] + " ");
        }
    }
}
