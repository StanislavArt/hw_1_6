import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        task1(arr);
        task2(arr);
        task3(arr);
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.printf("Сумма трат за месяц составила %,d рублей.%n", sum);
    }

    public static void task2(int[] arr) {
        if(arr.length == 0) return;
        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        System.out.printf("Минимальная сумма трат за день составила %,d рублей. %nМаксимальная сумма трат за день составила %,d рублей.%n", min, max);
    }

    public static void task3(int[] arr) {
        if (arr.length == 0) return;

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = sum * 1.0 / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.%n", avg);
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}