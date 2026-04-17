package lr11.example;

//Напишите функцию, которая принимает на вход список целых чисел и
//возвращает новый список, содержащий только те числа, которые меньше
//заданного значения.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ex10 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        int min = 200;

        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterGreaterThan(integers, min);

        System.out.println("\n" + "Список чисел, которые меньше заданного числа " + "\n");

        if (integersAfter.isEmpty()) {
            System.out.println("Таких чисел нет");
        } else {
            for (Integer i : integersAfter) {
                System.out.println(i);
            }
        }
    }

    public static List<Integer> filterGreaterThan(List<Integer> list, int min) {
        return list.stream()
                .filter(x -> x < min)
                .collect(Collectors.toList());
    }
}
