import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк матрицы: ");
        int line = sc.nextInt();
        System.out.println("Введите кол-во столбцов матрицы: ");
        int column = sc.nextInt();
        newMatrix newMatrix = new newMatrix(column,line);
        System.out.println("Полученная матрица:" + "\n" + newMatrix);

        System.out.println("Транспонированная матрица:" + newMatrix.transpositionMatrix());
    }
}