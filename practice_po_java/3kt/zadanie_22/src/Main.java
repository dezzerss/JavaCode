import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны треугольника.");
        System.out.println("Первая: ");
        int firstSide = sc.nextInt();
        System.out.println("Вторая: ");
        int secondSide = sc.nextInt();
        System.out.println("Третья: ");
        int lastSide = sc.nextInt();
        int halfMeter = (firstSide + secondSide + lastSide) / 2;
        System.out.println("Площадь треугольника = " + Math.sqrt(halfMeter * (halfMeter - firstSide) * (halfMeter - secondSide) * (halfMeter - lastSide)));
    }
}