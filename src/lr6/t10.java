package lr6;

public class t10 {
    static int[] minMax(int... n) {
        if (n.length == 0)
        return new int[]{0, 0};


        int min = n[0], max = n[0];
        for (int x : n) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] r = minMax(2, 8, 3, 5, 1);
        System.out.println("Min = " + r[0] + " Max = " + r[1]);
    }
}
