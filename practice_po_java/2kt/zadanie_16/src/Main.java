import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку для проверки: ");
        String str = sc.nextLine();
        System.out.println(checkingForUpperOrLowerCase.check(str));
    }
}