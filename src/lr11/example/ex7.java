package lr11.example;

//Напишите функцию, которая принимает на вход список строк и
//возвращает новый список, содержащий только те строки, которые имеют
//длину больше заданного значения.

import java.util.List;
import java.util.stream.Collectors;

public class ex7 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк и " +
                "возвращает новый список, содержащий только те строки, которые имеют " +
                "длину больше заданного значения.";

        int dlina = 9;

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterStringsLongerThan(strings, dlina);

        System.out.println("\n" + "Строки, длина которых больше " + dlina + ": " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterStringsLongerThan(List<String> list, int dlina) {
        return list.stream()
                .filter(s -> s.length() > dlina)
                .collect(Collectors.toList());
    }
}
