package lr5;

public class t2 {
    char symbol1;
    char symbol2;

    public void Result() {
        char start = symbol1 < symbol2 ? symbol1 : symbol2;
        char end = symbol1 < symbol2 ? symbol2 : symbol1;

        for (char ch = start; ch <= end; ch++) {
            System.out.print(ch + " ");
        }
    }

    public static void main(String[] args) {
        t2 pro = new t2();

        pro.symbol1 = 'A';
        pro.symbol2 = 'D';
        pro.Result();
    }
}
