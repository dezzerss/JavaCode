import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите начало ряда: ");
        int beginningOfTheRow = sc.nextInt();
        System.out.println("Введите конец ряда: ");
        int endOfRow = sc.nextInt();
        System.out.println("Введите делители:");
        int numDivisors = sc.nextInt();
        int[] divisors = new int[numDivisors];
        for (int i = 0; i < numDivisors; i++) {
            divisors[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = beginningOfTheRow; i <= endOfRow; i++) {
            for (int j = 0; j < numDivisors; j++) {
                if (i % divisors[j] == 0) {
                    sum += i;
                    break;
                }
            }
        }
        System.out.println("Сумма будет равна - " + sum);
    }
}