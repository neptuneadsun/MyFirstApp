package lr6;

public class t6 {
    public static int[] sss (int[] arr, int num) {
        if (num >= arr.length) {
            int[] copy = new int[arr.length];
            for ( int i = 0; i < arr.length; i++) {
                copy[i] = arr[i];
            }

            return copy;
        }

        int[] res = new int[num];
        for (int i = 0; i < num; i++) {
            res[i] = arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] or = {1,2,3,4,5};

        int[] res1 = sss(or, 3);
        System.out.println("Первые 3: ");
        for (int n : res1) {
            System.out.print(n + " ");
        }

        int[] res2 = sss(or, 6);
        System.out.println("Первые 6: ");
        for (int n : res2) {
            System.out.print(n + " ");
        }
    }
}
