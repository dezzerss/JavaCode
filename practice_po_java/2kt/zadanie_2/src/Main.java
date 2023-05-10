import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа: ");
        List<String> list = new ArrayList<String>();
        int num = sc.nextInt();
        int i = 0;
        if (num < 2) {
            if(num==1){
                i++;
                list.add("true");
            } else {
                list.add("false");
            }
        }
        while (num < 2){
            num = sc.nextInt();
            if (num == 1){
                i++;
                list.add("true");
            } else {
                list.add("false");

            }
        }
        int index = list.size() - 1;
        list.remove(index);
        System.out.println(list + "\n" + "Кол-во работников: " + i);
    }
}