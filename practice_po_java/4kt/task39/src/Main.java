import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое, положительное число: ");
        int num = sc.nextInt();
        System.out.println("Полученное число имеет вид: " + "\n" + convertedNum(num));
    }
    public static int convertedNum(int num) {
        String numStr = Integer.toString(num);
        int strLength = numStr.length();
        int i = strLength - 1;
        while (i > 0 && numStr.charAt(i-1) >= numStr.charAt(i)) {
            i--;
        }
        if (i == 0) {
            return -1;
        }
        int j = strLength - 1;
        while (numStr.charAt(j) <= numStr.charAt(i-1)) {
            j--;
        }
        char[] arrayOfTheNumberNum = numStr.toCharArray();
        char temp = arrayOfTheNumberNum[i-1];
        arrayOfTheNumberNum[i-1] = arrayOfTheNumberNum[j];
        arrayOfTheNumberNum[j] = temp;
        for (int k = i; k < (strLength+i)/2; k++) {
            temp = arrayOfTheNumberNum[k];
            arrayOfTheNumberNum[k] = arrayOfTheNumberNum[strLength+i-k-1];
            arrayOfTheNumberNum[strLength+i-k-1] = temp;
        }
        String nextNumStr = new String(arrayOfTheNumberNum);
        return Integer.parseInt(nextNumStr) > num ? Integer.parseInt(nextNumStr) : -1;
    }
}
