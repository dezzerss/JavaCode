import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        int num = sc.nextInt();
        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("Число составное !");
        } else {
            System.out.println("Число простое !");
        }
    }
}