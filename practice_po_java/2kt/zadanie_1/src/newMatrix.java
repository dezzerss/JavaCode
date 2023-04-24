import java.util.Random;

public class newMatrix {
    private final int[][] newMatrix;
    public newMatrix(int column, int line) {
        Random rand = new Random();
        newMatrix = new int[line][column];
        for (int i = 0;i < newMatrix.length;i++) {
            for(int j = 0;j < newMatrix[i].length;j++) {
                newMatrix[i][j] = rand.nextInt(10);
            }
        }
        for (int i = 0;i < newMatrix.length;i++) {
            for(int j = 0;j < newMatrix[i].length;j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public String transpositionMatrix() {
        String mat = "\n";
        for (int i = 0; i < newMatrix[i].length; i++) {
            for (int j = 0; j < newMatrix.length; j++) {
                mat += newMatrix[j][i] + " ";
            }
            mat += "\n";
        }
        return mat;
    }

    @Override
    public String toString() {
        String matrixa = "\n";
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                matrixa += newMatrix[i][j] + " ";
            }
            matrixa += "\n";
        }
        return matrixa;
    }
}

