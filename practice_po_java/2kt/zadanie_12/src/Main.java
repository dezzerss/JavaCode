import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое будет являться началом ряда и шагом для след числа: ");
        int startAndStep = sc.nextInt();
        System.out.println("Введите второе число, которое отвечает за кол-во чисел: ");
        int numberOfNumbers = sc.nextInt();
        String result = "";
        for (int i = 1; i <= numberOfNumbers; i += startAndStep) {
            result += (int) Math.pow(i, 2) + ",";
        }
        System.out.println(result);
    }
}