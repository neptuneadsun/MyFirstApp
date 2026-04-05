package lr10.t2.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr10/t2/JSON/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите автора: ");
            String author = scanner.nextLine();
            scanner.close();

            // Флаг для отслеживания, найдены ли книги
            boolean found = false;

            for (Object bookObj : jsonArray) {
                if (bookObj instanceof JSONObject) {
                    JSONObject book = (JSONObject) bookObj;
                    Object authorObj = book.get("author");

                    // Безопасная проверка: проверяем, что authorObj не null и является строкой
                    if (authorObj != null && authorObj instanceof String && author.equals(authorObj)) {
                        System.out.println("\nТекущий элемент: book");
                        System.out.println("Название книги: " + book.get("title"));
                        System.out.println("Автор: " + authorObj);
                        System.out.println("Год издания: " + book.get("year"));
                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.println("Книги автора '" + author + "' не найдены.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
