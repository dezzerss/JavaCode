import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длины сторон треугольника.");
        System.out.println("Первая сторона: ");
        int a = sc.nextInt();
        System.out.println("Вторая: ");
        int b = sc.nextInt();
        System.out.println("Третья: ");
        int c = sc.nextInt();
        Triangle triangle = new Triangle(a, b, c);
        if (triangle.check()) {
            System.out.println("Можно составить треугольник.");
            System.out.println("Наибольший внешнний угол которого будет равен: " + triangle.largestAngle());
        } else {
            System.out.println("Нельзя составить треугольник.");
        }
    }
}