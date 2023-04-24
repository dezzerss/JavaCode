import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        System.out.println("Введите символ для проверки: ");
        char symbol = sc.next().charAt(0);
        System.out.println(Count.strCount(str, symbol));
    }
}