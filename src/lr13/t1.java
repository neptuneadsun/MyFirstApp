package lr13;

// Сгенерировано и перехвачено RuntimeException
// Предок может перехватить исключения всех своих потомков

public class t1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) { // исключение перехвачено
            System.out.println("1 " + e); // исключение
        }
        System.out.println("2");
    }
}
