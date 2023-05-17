import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во палочек: ");
        int num = sc.nextInt();
        if (num >= 1 && num <= Math.pow(10, 18)) {
            if (num % 2 == 0) {
                System.out.println("Игрок может взять одну или половину палочек");
            } else {
                System.out.println("Игрок может взять только одну палочку");
            }
        } else {
            System.out.println("Число не входит в интервал допустимых чисел");
        }
    }
}