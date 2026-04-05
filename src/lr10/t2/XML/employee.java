package lr10.t2.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class employee {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание корневого элемента
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Employee");
            doc.appendChild(rootElement);

            // Добавление первого сотрудника
            Element book1 = doc.createElement("employee");
            rootElement.appendChild(book1);

            Element title1 = doc.createElement("FIO");
            title1.appendChild(doc.createTextNode("Иванов Иван Иванович"));
            book1.appendChild(title1);

            Element work1 = doc.createElement("work");
            work1.appendChild(doc.createTextNode("Менеджер"));
            book1.appendChild(work1);

            // Добавление второго сотрудника
            Element book2 = doc.createElement("employee");
            rootElement.appendChild(book2);

            Element title2 = doc.createElement("FIO");
            title2.appendChild(doc.createTextNode("Сергеев Сергей Сереевич"));
            book2.appendChild(title2);

            Element work2 = doc.createElement("work");
            work2.appendChild(doc.createTextNode("Руководитель"));
            book2.appendChild(work2);

            // Запись XML-файла
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File("src/lr10/t2/XML/employee.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан!");

        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }
}
