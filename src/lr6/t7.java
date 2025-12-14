package lr6;

public class t7 {
    public static char[] Cd (char[] arr) {
        char[] code = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            code[i] = arr[i];
        }

        return code;
    }

    public static void main(String[] args) {
        char[] arr1 = {'A', 'B', 'C', 'D', 'E'};
        char[] code1 = Cd (arr1);
        System.out.println("Буквы: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " - " + code1[i]);
        }

        char[] arr2 = {'1', '2', '3', '!', '@',};
        char[] code2 = Cd (arr2);
        System.out.println("Символы и цифры: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " - " + code2[i]);
        }
    }
}
