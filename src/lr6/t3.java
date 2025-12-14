package lr6;

public class t3 {
    //(int... nums) — это "varargs" (variable arguments) — переменное количество аргументов.
    public static int max(int... nums) {
        if (nums.length == 0) return 0;
        int m = nums[0];
        for (int n : nums) if (n > m) m = n;
        return m;
    }

    public static int min(int... nums) {
        if (nums.length == 0) return 0;
        int m = nums[0];
        for (int n : nums) if (n < m) m = n;
        return m;
    }

    public static double avg(int... nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int n : nums) sum += n;
        return (double) sum / nums.length;
    }

    public static void main(String[] args) {
        System.out.println("Max: " + max(1,2,3,4,5));
        System.out.println("Min: " + min(1,2,3,4,5));
        System.out.println("Average: " + avg(1,2,3,4,5));

        int[] arr = {10, 20, 30};
        System.out.println("Max: " + max(arr));   // 30
        System.out.println("Min: " + min(arr));
        System.out.println("Average: " + avg(arr));
    }
}
