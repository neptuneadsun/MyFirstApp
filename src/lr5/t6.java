package lr5;

public class t6 {
    private int min;
    private int max;

    public t6 () {
        this.max = 0;
        this.min = 0;
    }

    public t6 (int val) {
        this.max = val;
        this.min = val;
    }

    public t6 (int val1, int val2) {
        setValues(val1, val2);
    }

    public void setValues (int val1, int val2) {
        this.max = Math.max(val1, val2);
        this.min = Math.min(val1, val2);
    }

    public void displayValues() {
        System.out.println("max = " + max + ", min = " + min);
    }

    public static void main(String[] args) {
        t6 obj1 = new t6();
        obj1.displayValues(); // max = 0, min = 0

        t6 obj2 = new t6(10);
        obj2.displayValues();

        t6 obj3 = new t6(5, 15);
        obj3.displayValues();

        t6 obj4 = new t6(20, 8);
        obj4.displayValues();

        obj1.setValues(30, 12);
        obj1.displayValues();
    }
}
