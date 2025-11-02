package lr3;

import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
//    оператор switch
        Scanner id = new Scanner(System.in);
        System.out.println("Введите день недели");

        String ddname = id.nextLine();
        int dd = 0;

        switch (ddname) {
            case "понедельник":
                dd = 1;
                break;
            case "вторник":
                dd = 2;
                break;
            case "среда":
                dd = 3;
                break;
            case "четверг":
                dd = 4;
                break;
            case "пятница":
                dd = 5;
                break;
            case "суббота":
                dd = 6;
                break;
            case "воскресенье":
                dd = 7;
                break;

            default:
                System.out.println("Такого дня не существует");
                break;
        }
        System.out.println("День в неделе: " + dd);

//        условный оператор
//
//        if (ddname.equals("понедельник")) {
//            dd = 1;
//        }
//        else if (ddname.equals("вторник")) {
//            dd = 2;
//        }
//        else if (ddname.equals("среда")) {
//            dd = 3;
//        }
//        else if (ddname.equals("четверг")) {
//            dd = 4;
//        }
//        else if (ddname.equals("пятница")) {
//            dd = 5;
//        }
//        else if (ddname.equals("суббота")) {
//            dd = 6;
//        }
//        else if (ddname.equals("воскресенье")) {
//            dd = 7;
//        }
//        else {
//            dd = -1;
//        }
//
//        if (dd != 1) {
//            System.out.println("День в неделе: " + dd);
//        }
//        else {
//            System.out.println("Такого дня не существует");
//        }
    }
}
