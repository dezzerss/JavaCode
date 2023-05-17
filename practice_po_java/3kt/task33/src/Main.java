import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во палочек: ");
        long num = sc.nextLong();
        long tanya = num; // исходное кол-во палочек у Тани
        boolean sashaTurn = false; // определение того, чей сейчас ход
        while (num > 1) {
            if (num % 2 == 0) {
                if (sashaTurn) num /= 2; // Саша берет половину палочек
                else num--;
            } else {
                num--; // Таня берет одну палочку
            }
            sashaTurn = !sashaTurn;
            if (!sashaTurn) tanya = num; // если следующий ход у Тани - обновляем количество палочек у нее
        }
        System.out.println("Кол-во палочек у Тани - " + tanya); //
    }
}