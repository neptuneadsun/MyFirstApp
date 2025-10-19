package lr2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, которое будет больше или равно 1000: ");
        int num = in.nextInt();

        int k = num / 1000;
        int ost = k % 10;


        System.out.println("В числе " + num + " - " + ost + " тысяч");


    }
}
