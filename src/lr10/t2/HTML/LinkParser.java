package lr10.t2.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class LinkParser {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        int maxAttempts = 3;
        int attempt = 1;
        boolean success = false;

        while (attempt <= maxAttempts && !success) {
            try {
                System.out.println("Попытка подключения " + attempt + " из " + maxAttempts + "...");

                Document doc = Jsoup.connect(url)
                        .timeout(10000)
                        .get();

                Elements links = doc.select("a[href]");

                for (Element link : links) {
                    System.out.println(link.attr("abs:href"));
                }

                success = true;

            } catch (IOException e) {
                System.out.println("Ошибка при подключении: " + e.getMessage());

                if (attempt < maxAttempts) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
                attempt++;
            }
        }
    }
}