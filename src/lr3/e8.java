package lr3;

public class e8 {
    public static void main(String[] args) {
        int size = 10;

        char[] symb = new char[size];
        char let = 'A';
        int i = 0;

        while (i < size) {
            if (let != 'A' &&
                    let != 'E' &&
                    let != 'I' &&
                    let != 'O' &&
                    let != 'U' &&
                    let != 'Y') {
                symb[i] = let;
                i++;
            }
            let++;
        }

        System.out.println("Массив согласных: ");
        for (i = 0; i < symb.length; i++) {
            System.out.print(symb[i] + " ");
        }
    }
}
