package lr11.example;

//Напишите функцию, которая принимает на вход список целых чисел и
//возвращает новый список, содержащий только те числа, которые делятся на
//заданное число без остатка.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ex6 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        int del = 2;

        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterDelNumbers(integers, del);

        System.out.println("\n" + "Список, который делается на " + del + " без остатка): " + "\n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterDelNumbers(List<Integer> list, int del) {
        return list.stream()
                .filter(x -> x % del == 0)
                .collect(Collectors.toList());
    }
}
