package lr6;

public class t2 {
    private static int num = 0;

    static void Incr() {
        System.out.println("Число: " + num);
        num++;
    }

    public static void main(String[] args) {
        Incr();
        Incr();
        Incr();
    }
}
