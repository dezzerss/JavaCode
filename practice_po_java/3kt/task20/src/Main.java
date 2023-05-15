import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту массива: ");
        int m = sc.nextInt();
        System.out.println("Введите ширину массива: ");
        int n = sc.nextInt();
        int[][] arrayList = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int ring = Math.min(Math.min(i, j), Math.min(m - i - 1, n - j - 1));
                arrayList[i][j] = ring + 1;
            }
        }
        System.out.println("Массив будет иметь вид: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayList[i][j] + " ");
            }
            System.out.println();
        }
    }
}