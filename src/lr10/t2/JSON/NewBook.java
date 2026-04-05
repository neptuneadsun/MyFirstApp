package lr10.t2.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class NewBook {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("src/lr10/t2/JSON/example-json.json"));
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите название книги: ");
            String title = scanner.nextLine();

            System.out.print("Введите автора: ");
            String author = scanner.nextLine();

            System.out.print("Введите год издания: ");
            int year = scanner.nextInt();

            JSONObject newBook = new JSONObject();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);
            jsonArray.add(newBook);

            FileWriter file = new FileWriter("src/lr10/t2/JSON/example-json.json");
            file.write(jsonObject.toJSONString());
            file.close();

            System.out.println("Книга добавлена!");

            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}