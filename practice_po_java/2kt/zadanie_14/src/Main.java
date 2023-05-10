import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа.");
        System.out.println("Первое: ");
        String firstNum = sc.nextLine();
        System.out.println("Второе: ");
        String secondNum = sc.nextLine();
        System.out.println("Третье: ");
        String thirdNum = sc.nextLine();
        memory cell = new memory(firstNum, secondNum, thirdNum);
        if (memory.checkForEmptyCell()) {
            System.out.println("Ячейка имеет вид: " + cell);
        } else {
            memory.smallestNumber();
            System.out.println("Ячейка имеет вид: " + cell);
        }
    }
}