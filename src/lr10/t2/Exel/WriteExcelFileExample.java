package lr10.t2.Exel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFileExample {
    public static void main(String[] args) {
        String filePath = "src/lr10/t2/Exel/t2.xlsx";

        try {
            // Создаем папки, если их нет
            java.io.File dir = new java.io.File("src/lr10/t2/Exel/");
            if (!dir.exists()) {
                if (dir.mkdirs()) {
                    System.out.println("Создана директория: " + dir.getPath());
                }
            }

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Товары");

            // Проверка, не создан ли уже лист с таким именем
            if (workbook.getSheet("Товары") == null) {
                sheet = workbook.createSheet("Товары");
            } else {
                sheet = workbook.getSheet("Товары");
            }

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Товар");
            headerRow.createCell(1).setCellValue("Характеристики");
            headerRow.createCell(2).setCellValue("Стоимость");

            Row dataRow1 = sheet.createRow(1);
            dataRow1.createCell(0).setCellValue("Книга");
            dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
            dataRow1.createCell(2).setCellValue(500.0);

            Row dataRow2 = sheet.createRow(2);
            dataRow2.createCell(0).setCellValue("Компьютер");
            dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память");
            dataRow2.createCell(2).setCellValue(25000.0);

            FileOutputStream outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

            System.out.println("Данные успешно записаны в файл: " + filePath);

        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
            System.out.println("Рекомендация: Проверьте права на запись в директорию и свободное место на диске.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}