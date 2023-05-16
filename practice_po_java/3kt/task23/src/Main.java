import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое будет отвечать за кол-во чисел в ряде: ");
        int numberOfNumbers = sc.nextInt();
        System.out.println("Введите первый делитель: ");
        int theFirstDivisor = sc.nextInt();
        System.out.println("Второй: ");
        int theSecondDivisor = sc.nextInt();
        int checkFirstDivisor = 0;
        int checkSecondDivisor = 0;
        for (int i = 0;i <= numberOfNumbers;i++) {
            if(i % theFirstDivisor == 0) {
                checkFirstDivisor += i;
            } else if (i % theSecondDivisor == 0) {
                checkSecondDivisor += i;
            }
        }
        System.out.print("Сумма будет равна: " + (checkFirstDivisor + checkSecondDivisor));
    }
}