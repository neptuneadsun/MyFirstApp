package lr5;

public class t4 {
    char sym;
    int num;

    public t4(int num, char sym) {
        num = num;
        sym = sym;
    }

    public t4(double value) {
        sym = (char)((int)value);
        num = (int)((value - (int)value) * 100);
    }

    public void show() {
        System.out.println("Символ: " + sym + " (код " + (int)sym + "), Число: " + num);
    }

    public static void main(String[] args) {
        // Простой тест
        t4 a = new t4(65.1267);
        a.show();

        t4 b = new t4(10, 'X');
        b.show();
    }

}
