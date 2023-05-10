import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        int receivedNum = (int) Math.round(Math.sqrt(num));
        System.out.println("Полученное число имеет вид: " + receivedNum);
    }
}