package lr10.t2.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("src/lr10/t2/JSON/example-json.json"));
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите название книги для удаления: ");
            String title = scanner.nextLine();

            Iterator iterator = jsonArray.iterator();
            boolean found = false;

            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (title.equals(book.get("title"))) {
                    iterator.remove();
                    found = true;
                    System.out.println("Книга \"" + title + "\" удалена.");
                }
            }

            if (!found) {
                System.out.println("Книга \"" + title + "\" не найдена.");
            }

            FileWriter file = new FileWriter("src/lr10/t2/JSON/example-json.json");
            file.write(jsonObject.toJSONString());
            file.close();

            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}