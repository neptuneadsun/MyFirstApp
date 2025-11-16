package lr4;

import java.util.Scanner;

public class Encrypt {
    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);

        return encryptString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String text = scanner.nextLine();

        System.out.println("Введите ключ: ");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encryptedText = getEncryptString(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = scanner.nextLine();

        if (answer.equals("y")) {
            String decryptedText = getEncryptString(encryptedText, -key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (answer.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }

        scanner.close();
    }
}