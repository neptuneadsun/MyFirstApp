package lr6;

public class t5 {
    public static int square (int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i * i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("1² + 2² + 3² = " + square(3));
    }
}
