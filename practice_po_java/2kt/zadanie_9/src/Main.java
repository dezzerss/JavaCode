import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str = sc.nextLine();
        System.out.println("Введите вторую строку, для проверки: ");
        String lastOfStr = sc.nextLine();
        if (checkForReapeat(str, lastOfStr)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean checkForReapeat(String firstText, String secondText) {
        return firstText.endsWith(secondText);
    }
}