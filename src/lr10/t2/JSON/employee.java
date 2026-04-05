package lr10.t2.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class employee {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("FIO", "Иванов Иван Иванович");
        book1.put("work", "Менеджер");

        JSONObject book2 = new JSONObject();
        book2.put("FIO", "Сергеев Сергей Сереевич");
        book2.put("work", "Руководитель");

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try (FileWriter file = new FileWriter("src/lr10/t2/JSON/example-json.json")) {
            file.write(library.toJSONString());
            System.out.println("Json файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
