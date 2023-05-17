import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int positiveNum = scanner.nextInt();
        System.out.println("Введите число, для начала ряда: ");
        int startNum = scanner.nextInt();
        int sum = 0;
        int power = 1;
        while (true) {
            int digit = getNum(positiveNum, power);
            if (digit == 0) {
                break;
            }
            sum += Math.pow(startNum, power) * digit;
            power++;
        }
        for (int i = 2; i <= Math.pow(2, 6); i++) {
            if (sum % i == 0 && isFactor(startNum, i)) {
                System.out.println(sum + " = " + startNum + " * " + (sum / i));
                return;
            }
        }
        System.out.println("Ситуация невозможна");
    }
    private static int getNum(int num, int power) {
        int divisor = (int) Math.pow(10, power - 1);
        return num / divisor % 10;
    }
    private static boolean isFactor(int num, int factor) {
        while (num % factor == 0) {
            num /= factor;
        }
        return num == 1;
    }
}