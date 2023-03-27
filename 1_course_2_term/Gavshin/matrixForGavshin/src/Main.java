import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        System.out.println("Введите кол-во строк: ");
        int line = sc.nextInt();
        System.out.println("Введите кол-во столбцов: ");
        int column = sc.nextInt();
        Matrix matrix = new Matrix(line, column);
        System.out.println(matrix);
    }
}