package lr10.t2.Exel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadExcelFileExample {
    public static void main(String[] args) {
        String filePath = "src/lr10/t2/Exel/t2.xlsx";
        boolean success = false;

        while (!success) {
            try {
                // Проверка существования файла
                java.io.File file = new java.io.File(filePath);
                if (!file.exists()) {
                    System.out.println("Ошибка: Файл не найден по пути: " + filePath);
                    System.out.println("Рекомендация: Проверьте правильность пути к файлу и наличие файла.");
                    System.out.print("Введите правильный путь к файлу (или 'exit' для выхода): ");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("exit")) {
                        return;
                    }
                    filePath = input;
                    continue;
                }

                // Проверка расширения файла
                if (!filePath.endsWith(".xlsx")) {
                    System.out.println("Ошибка: Неверный формат файла. Ожидается файл с расширением .xlsx");
                    System.out.println("Рекомендация: Убедитесь, что файл является Excel-файлом формата .xlsx");
                    return;
                }

                FileInputStream inputStream = new FileInputStream(filePath);
                XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

                // Проверка наличия листа
                XSSFSheet sheet = workbook.getSheet("Товары");
                if (sheet == null) {
                    System.out.println("Ошибка: Лист с именем 'Товары' не найден в файле.");
                    System.out.println("Рекомендация: Проверьте название листа. Доступные листы:");
                    for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                        System.out.println(" - " + workbook.getSheetName(i));
                    }
                    workbook.close();
                    inputStream.close();
                    return;
                }

                // Проверка, пустой ли лист
                if (sheet.getPhysicalNumberOfRows() == 0) {
                    System.out.println("Предупреждение: Лист 'Товары' пуст. Нет данных для чтения.");
                    workbook.close();
                    inputStream.close();
                    return;
                }

                // Чтение данных
                System.out.println("Содержимое файла " + filePath + ":\n");
                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }

                workbook.close();
                inputStream.close();
                success = true;
                System.out.println("\nФайл успешно прочитан!");

            } catch (FileNotFoundException e) {
                System.out.println("Ошибка: Файл не найден.");
                System.out.println("Проверьте путь к файлу и убедитесь, что файл существует.");
                e.printStackTrace();
                return;
            } catch (IOException e) {
                System.out.println("Ошибка ввода-вывода при работе с файлом.");
                System.out.println("Проверьте, не открыт ли файл другой программой, и есть ли права на чтение.");
                e.printStackTrace();
                return;
            } catch (Exception e) {
                System.out.println("Неизвестная ошибка: " + e.getMessage());
                System.out.println("Проверьте структуру файла");
                e.printStackTrace();
                return;
            }
        }
    }
}