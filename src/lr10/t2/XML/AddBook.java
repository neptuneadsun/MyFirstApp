package lr10.t2.XML;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class AddBook {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Название: ");
        String title = scanner.nextLine();
        System.out.print("Автор: ");
        String author = scanner.nextLine();
        System.out.print("Год: ");
        String year = scanner.nextLine();

        // загрузка xml файла
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new File("src/lr10/t2/XML/example.xml"));

        // создание новой книги
        Element book = doc.createElement("book");

        // создание и заполнения нового элемента данными
        book.appendChild(doc.createElement("title")).appendChild(doc.createTextNode(title));
        book.appendChild(doc.createElement("author")).appendChild(doc.createTextNode(author));
        book.appendChild(doc.createElement("year")).appendChild(doc.createTextNode(year));

        // добавление новую книгу в xml файл
        doc.getDocumentElement().appendChild(book);

        TransformerFactory.newInstance().newTransformer()
                .transform(new DOMSource(doc), new StreamResult(new File("src/lr10/t2/XML/example.xml")));

        System.out.println("Книга добавлена!");
    }
}
