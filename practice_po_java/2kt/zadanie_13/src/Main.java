import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа ряда");
        System.out.println("Начало: ");
        int startOfRow = sc.nextInt();
        System.out.println("Шаг: ");
        int step = sc.nextInt();
        System.out.println("Кол-во шагов: ");
        int numberOfSteps = sc.nextInt();
        String result = "";
        for (int i = startOfRow; i <= numberOfSteps * step; i += step) {
            result += i + " ";
        }
        System.out.println(result);
    }
}