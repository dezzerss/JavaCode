import java.util.Arrays;

import java.util.Random;
public class Matrix {
    private int[][] matrix;

    Matrix(int line, int column) {
        matrix = new int[line][column];
        Random rand = new Random();

        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
    }

    public int sumOfMatrix() {
        int sum = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                sum += ints[j];
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Матрица 'matrix' имеет след. вид: " + Arrays.deepToString(matrix);
    }
}




/////////
import java.util.Arrays;

import java.util.Random;

public class Matrix {
    private int[][] matrix;

    Matrix(int a) {
        matrix = new int[a][a];
        Random rand = new Random();

        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
    }

    public int summ() {
        int summ = 0;
        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[i].length; j++) {
                if (i < j) {
                    summ += matrix[i][j];
                }

            }
        }
        return summ;
    }

    public int multiply() {
        int multiplication = 1;
        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    multiplication *= matrix[i][j];
                }
            }

        }
        return multiplication;
    }

    public int substrct() {
        int subtraction = 0;
        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[i].length; j++) {
                if (i > j) {
                    subtraction -= matrix[i][j];
                }
            }
        }
        return subtraction;
    }


    @Override
    public String toString() {
        return Arrays.deepToString(matrix);
    }

}
////////////
MAIN 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int a = sc.nextInt();
        Matrix matrix = new Matrix(a);
        System.out.println(matrix);
        System.out.println("Сумма: " + matrix.summ());
        System.out.println("Произведение: " + matrix.multiply());
        System.out.println("Вычитание: " + matrix.substrct());
    }
}
