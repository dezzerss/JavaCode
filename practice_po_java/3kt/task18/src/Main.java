import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final ArrayList<Integer> leftArray = new ArrayList<>();
    public static final ArrayList<Integer> rightArray = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в массиве: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Введите каждое число: ");
        for (int i = 0;i < size;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Исходный массив имеет вид: ");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();

        int maxNum = array[0];
        int idx = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                idx = i;
            }
        }
        for (int i = 0; i < idx; i++) {
            leftArray.add(array[i]);
        }
        for (int i = idx + 1; i < array.length ; i++) {
            rightArray.add(array[i]);
        }
        System.out.println("Левая часть массива: " + leftArray);
        System.out.println("Правая: " + rightArray);
    }

}