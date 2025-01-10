package ss4_oop_to_java.bai_tap;

import java.util.Random;
import java.util.Timer;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        System.out.println("Timer started at: " + this.startTime);
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        System.out.println("Timer ended at: " + this.endTime);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public void getElapsedTime() {
        System.out.println("Elapsed time: " + (System.currentTimeMillis() - startTime));
    }

    public static void main(String[] args) {
        int[] numbers = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000); // Số ngẫu nhiên từ 0 đến 99,999
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(numbers);
        stopWatch.stop();
        stopWatch.getElapsedTime();
    }
}
