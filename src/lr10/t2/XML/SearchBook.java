package lr10.t2.XML;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.util.Scanner;

public class SearchBook {
    public static void main(String[] args) throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new File("src/lr10/t2/XML/example.xml"));

        NodeList books = doc.getElementsByTagName("book");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите автора или год издания: ");
        String search = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            String author = book.getElementsByTagName("author").item(0).getTextContent();
            String year = book.getElementsByTagName("year").item(0).getTextContent();

            if (author.equalsIgnoreCase(search) || year.equals(search)) {
                System.out.println("\nНазвание: " + book.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Автор: " + author);
                System.out.println("Год: " + year);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Книги по запросу \"" + search + "\" не найдены.");
        }

        scanner.close();
    }
}