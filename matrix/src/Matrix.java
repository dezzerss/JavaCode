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
