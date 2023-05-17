import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало ряда: ");
        int beginningOfTheRow = scanner.nextInt();
        System.out.println("Введите конец ряда: ");
        int endOfRow = scanner.nextInt();
        int sum = 0;
        for (int i = beginningOfTheRow; i <= endOfRow; i++) {
            boolean isDivisible = true;
            for (int j = 2; j < args.length; j++) {
                if (i % Integer.parseInt(args[j]) != 0) {
                    isDivisible = false;
                    break;
                }
            }
            if (isDivisible) {
                sum += i;
            }
        }
        System.out.println("Сумма будет равна - " + sum);
    }
}