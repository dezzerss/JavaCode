import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа, для первого интервала: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Введите числа, для второго интервала: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Введите числа, для третьего интервала: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int subtractionOne;
        int subtractionTwo;
        int subtractionThree;

        if (x1 > y1) {
            subtractionOne = x1 - y1;
        } else {
            subtractionOne = y1 - x1;
        }
        if (x2 > y2) {
            subtractionTwo = x2 - y2;
        } else {
            subtractionTwo = y2 - x2;
        }
        if (x3 > y3) {
            subtractionThree = x3 - y3;
        } else {
            subtractionThree = y3 - x3;
        }

        System.out.println("Количество будет равно - " + (subtractionOne + subtractionTwo + subtractionThree));
    }
}