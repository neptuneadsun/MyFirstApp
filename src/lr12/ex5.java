package lr12;

// Напишите функцию, которая находит максимальный элемент в массиве
//целых чисел при помощи многопоточности. Количество потоков должно быть
//равно количеству ядер процессора.

public class ex5 {
    static int max = Integer.MIN_VALUE;
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int cores = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[cores];
        // для деления массива для потоков
        int chunkSize = array.length / cores;

        for (int i = 0; i < cores; i++) {
            final int start = i * chunkSize;
            final int end = (i == cores - 1) ? array.length : (i + 1) * chunkSize;
            threads[i] = new Thread(() -> {
                int localMax = array[start];
                for (int j = start + 1; j < end; j++) {
                    if (array[j] > localMax) localMax = array[j];
                }
                synchronized (lock) { if (localMax > max) max = localMax; }
            });
            threads[i].start();
        }
        for (Thread t : threads) t.join();
        System.out.println(max);
    }
}