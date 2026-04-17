package lr11.example;

//Напишите функцию, которая принимает на вход список строк и
//возвращает новый список, содержащий только те строки, которые содержат
//только буквы (без цифр и символов).

import java.util.List;
import java.util.stream.Collectors;

public class ex9 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "Напишите функции которая принимает на вход список строк",
                "и возвращает 123новый список, содержащий только те строки,",
                "которые содержат только буквы!!!!"
        );

        System.out.println("\n" + "Исходный список строк: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterOnlyLettersStrings(strings);

        System.out.println("\n" + "Строки, содержащие только буквы и пробелы: " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterOnlyLettersStrings(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[а-яА-Яa-zA-Z\\s]+"))
                .collect(Collectors.toList());
    }

}
