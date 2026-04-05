package lr10.t2.XML;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class DeleteBook {
    public static void main(String[] args) throws Exception {
        // Загружаем XML-файл
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new File("src/lr10/t2/XML/example.xml"));

        doc.getDocumentElement().normalize();

        NodeList books = doc.getElementsByTagName("book");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название книги для удаления: ");
        String titleToDelete = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            String title = book.getElementsByTagName("title").item(0).getTextContent();

            if (title.equalsIgnoreCase(titleToDelete)) {
                // Получаем родительский элемент и удаляем книгу
                Node parentNode = book.getParentNode();
                parentNode.removeChild(book);
                found = true;
                System.out.println("Книга \"" + title + "\" удалена.");
                break;
            }
        }

        if (!found) {
            System.out.println("Книга \"" + titleToDelete + "\" не найдена.");
        } else {
            // Сохраняем изменения в файл
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(new DOMSource(doc), new StreamResult(new File("src/lr10/t2/XML/example.xml")));
            System.out.println("XML-файл обновлён.");
        }

        scanner.close();
    }
}