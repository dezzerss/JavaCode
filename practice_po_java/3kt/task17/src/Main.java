import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скобки, для проверки: ");
        String str = sc.nextLine();
        int open = 0;
        int closed = 0;
        for (int i = 0;i < str.length();i++) {
            char check = str.charAt(i);
            if (check == '(') {
                open++;
            } else {
                closed++;
            }
        }
        if (open == closed) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}