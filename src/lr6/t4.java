package lr6;

public class t4 {
    public static int fact (int num) {
        if (num < 0) return 0;

        int res = 1;

        while (num > 0) {
            res *= num;
            num -= 2;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("Число: " + "2 Факториал: ");

        for (int i = 0; i <= 10; i++) {
            if (i < 10) {
                System.out.println(i + " | " + fact(i));
            }
            else {
                System.out.println(i + " | " + fact(i));
            }
        }
    }
}
