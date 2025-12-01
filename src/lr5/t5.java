package lr5;

public class t5 {
    private int val;

    public t5 () {
        this.val = 0;
        System.out.println("Создан объект с нулевым значением: " + val);
    }

    public t5 (int num) {
        setValue(num);
        System.out.println("Создан объект с значением: " + val);
    }

    public void setValue () {
        this.val = 0;
        System.out.println("Значение: 0");
    }

    public void checkValue() {
        System.out.println("Текущее значение поля: " + val);
    }

    public void setValue(int num) {
        if (num > 100) {
            this.val = 100;
            System.out.println("Переданное значение " + num + " > 100, установлено 100");
        } else {
            this.val = num;
            System.out.println("Значение установлено в " + num);
        }
    }

    public static void main(String[] args) {
        t5 obj1 = new t5();
        obj1.checkValue();

        t5 obj2 = new t5(50);
        obj2.checkValue();

        t5 obj3 = new t5(150);
        obj3.checkValue();

        obj1.setValue(80);
        obj1.checkValue();

        obj1.setValue();
        obj1.checkValue();

        obj2.setValue(120);
        obj2.checkValue();
    }
}
