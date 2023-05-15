import java.util.Random;

public class arrayList {
    private final int[][] arrayList;

    public arrayList(int m, int n) {
        Random rand = new Random();
        arrayList = new int[n][m];
        for (int i = 0; i < arrayList.length; i++) {
            for (int j = 0; j < arrayList[i].length; j++) {
                arrayList[i][j] = rand.nextInt(10);
            }
        }
        for (int i = 0; i < arrayList.length; i++) {
            for (int j = 0; j < arrayList[i].length; j++) {
                System.out.print(arrayList[i][j] + " ");
            }
            System.out.println();
        }
    }
}