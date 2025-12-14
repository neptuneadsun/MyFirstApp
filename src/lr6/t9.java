package lr6;

public class t9 {
    public static char[] swap(char[] arr) {
        char[] result = arr.clone();

        int left = 0;
        int right = result.length - 1;

        while (left < right) {
            char temp = result[left];
            result[left] = result[right];
            result[right] = temp;

            left++;
            right--;
        }

        return result;
    }

    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E'};
        char[] swapped = swap(chars);

        System.out.print("Ориг: ");
        for (char c : chars) System.out.print(c + " ");

        System.out.print("Замена: ");
        for (char c : swapped) System.out.print(c + " ");
    }
}
