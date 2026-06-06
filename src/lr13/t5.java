package lr13;

// Исключение не перехвачено

public class t5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        }
        //catch (NullPointerException e) {
            //System.out.println("1");
        //}
        catch (RuntimeException e) {  // добавлен подходящий перехватчик
            System.out.println("1");
        }
        System.out.println("2");
    }
}
