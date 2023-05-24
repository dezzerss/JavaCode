import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два положительных числа: ");
        String a = sc.nextLine();
        String b = sc.nextLine();
        int i = Integer.parseInt(a.trim());
        int j = Integer.parseInt(b.trim());
        String sum = String.valueOf(i + j);
        System.out.println("Сумма будет равна - " + sum);
    }
}