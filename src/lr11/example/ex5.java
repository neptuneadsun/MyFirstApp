package lr11.example;

//Напишите функцию, которая принимает на вход список строк и
//возвращает новый список, содержащий только те строки, которые содержат
//заданную подстроку.

import java.util.List;
import java.util.stream.Collectors;

public class ex5 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "Напишите функции, которая принимает на вход список строк",
                "и возвращает новый список, содержащий только те строки,",
                "которые содержат заданную подстроку.",
                "Это пример работы программы",
                "Подстрока может быть в любом месте строки"
        );

        String substring = "список";

        System.out.println("\n" + "Исходный список строк: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterStringsContainingSubstring(strings, substring);

        System.out.println("\n" + "Строки, содержащие подстроку \"" + substring + "\": " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterStringsContainingSubstring(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
