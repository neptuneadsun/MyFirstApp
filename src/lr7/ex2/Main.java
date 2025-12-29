package lr7.ex2;

public class Main {
    public static void main(String[] args) {
        //суперкласс
        SuperClass superObj = new SuperClass("text");
        System.out.println("Объект суперкласса: " + superObj);
        System.out.println("Длина строки: " + superObj.getLength());

        //подкласс
        SubClass subObj = new SubClass(1,"text");
        System.out.println("Объект подкласса: " + subObj);


        //без параметров
        subObj.setField();
        System.out.println("После setField(): " + subObj);

        //с текстовым параметром
        subObj.setField("text text");
        System.out.println("После setField: " + subObj);

        //с целочисленным параметром
        subObj.setField(2);
        System.out.println("После setField(2): " + subObj);

        //с двумя параметрами
        subObj.setField("text text text", 3);
        System.out.println("После setField: " + subObj);
    }
}
