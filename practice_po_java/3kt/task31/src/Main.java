import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер элемента ряда Фибоначчи (от 10 до 100000):");
        int n = scanner.nextInt();
        long fibN = fibonacci(n);
        Map<Integer, Integer> digitCount = countDigits(fibN);
        int maxDigit = findMaxDigit(digitCount);
        System.out.printf("Ответ: " + "f(%d) = %d  # вернет [(%d, %d)]", n, fibN, maxDigit, digitCount.get(maxDigit));
    }
    private static long fibonacci(int n) {
        long prev1 = 0;
        long prev2 = 1;
        long fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = prev1 + prev2;
            prev1 = prev2;
            prev2 = fib;
        }
        return fib;
    }
    // Метод для подсчета количества вхождений каждой цифры в числе
    private static Map<Integer, Integer> countDigits(long number) {
        Map<Integer, Integer> digitCount = new HashMap<>();
        while (number != 0) {
            int digit = (int) (number % 10);
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
            number /= 10;
        }
        return digitCount;
    }
    // Метод для нахождения цифры с максимальным количеством вхождений
    private static int findMaxDigit(Map<Integer, Integer> digitCount) {
        int maxDigit = -1;
        int maxCount = -1;
        for (int digit : digitCount.keySet()) {
            int count = digitCount.get(digit);
            if (count > maxCount || (count == maxCount && digit > maxDigit)) {
                maxDigit = digit;
                maxCount = count;
            }
        }
        return maxDigit;
    }
}