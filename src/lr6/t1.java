package lr6;

public class t1 {
    char symb;
    String txt;

    public void setValue(char s) {
        symb = s;
    }

    public void setValue(String t) {
        txt = t;
    }

    void setValue(char[] arr) {
        if (arr.length == 1) {
            symb = arr[0];
        }
        else {
            txt = new String(arr);
        }
    }
    void show() {
        System.out.println("char: " + symb + " text: " + txt);
    }

    public static void main(String[] args) {
        t1 obj = new t1();

        obj.setValue('A');
        obj.show();

        obj.setValue("Привет");
        obj.show();

        obj.setValue(new char[]{'X'});
        obj.show();

        obj.setValue(new char[]{'T', 'e', 's', 't'});
        obj.show();
    }
}
