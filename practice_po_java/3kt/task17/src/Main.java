import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скобки, для проверки: ");
        String str = sc.nextLine();
        int open = 0;
        int closed = 0;
        for (int i = 0;i < str.length();i++) {
            char checkStr = str.charAt(i);
            if (checkStr == '(') {
                open += 1;
            } else {
                closed += 1;
            }
        }
        if (closed == open) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}