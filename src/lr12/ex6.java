package lr12;

// Напишите функцию, которая суммирует элементы в массиве целых чисел
//при помощи многопоточности. Количество потоков должно быть равно
//количеству ядер процессора.

public class ex6 {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int cores = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[cores];
        int[] results = new int[cores];
        int chunkSize = array.length / cores;

        for (int i = 0; i < cores; i++) {
            final int start = i * chunkSize;
            final int end = (i == cores - 1) ? array.length : (i + 1) * chunkSize;
            final int index = i;

            threads[i] = new Thread(() -> {
                int localSum = 0;
                for (int j = start; j < end; j++) localSum += array[j];
                results[index] = localSum;
            });
            threads[i].start();
        }

        for (Thread t : threads) t.join();

        int sum = 0;
        for (int r : results) sum += r;
        System.out.println("Сумма: " + sum);
    }
}
