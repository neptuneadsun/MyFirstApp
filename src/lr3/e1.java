package lr3;

import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите цифру от 1 до 7");

        int dd = id.nextInt();
        String ddname;

        switch (dd) {
            case 1:
                ddname = "Понедельник";
                break;
            case 2:
                ddname = "Вторник";
                break;
            case 3:
                ddname = "Среда";
                break;
            case 4:
                ddname = "Четверг";
                break;
            case 5:
                ddname = "Пятница";
                break;
            case 6:
                ddname = "Суббота";
                break;
            case 7:
                ddname = "Воскресенье";
                break;

            default:
                ddname = "Неккоректный день";
                break;
        }

        System.out.println("День недели: " + ddname);
    }
}
