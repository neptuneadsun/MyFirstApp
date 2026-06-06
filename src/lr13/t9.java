package lr13;

// Генерация исключительной ситуации в методе и дополнительное использование оператора return

public class t9 {
    public static int m() {
        try {
            System.out.println("0");
            return 55; // ВЫХОД ИЗ МЕТОДА
        } finally {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}
