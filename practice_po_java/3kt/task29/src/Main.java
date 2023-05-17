import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, для проверки: ");
        int number = scanner.nextInt();
        int firstSquare = (int) Math.sqrt(number);
        int secondSquare = (int) Math.sqrt(number + firstSquare * firstSquare);
        System.out.println("Разница будет равна - " + (secondSquare * secondSquare - number));
        }
    }
