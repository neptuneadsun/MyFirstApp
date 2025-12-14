package lr6;

public class t8 {
    public static double Cd (int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double result = Cd (arr);
        System.out.println("Среднее: " + result);
    }
}
