import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Римское число: ");
        String romanNum = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int arabicNum = 0;
        for (int i = 0; i < romanNum.length(); i++) {
            int value = map.get(romanNum.charAt(i));
            if (i + 1 < romanNum.length() && map.get(romanNum.charAt(i + 1)) > value) {
                arabicNum -= value;
            } else {
                arabicNum += value;
            }
        }
        System.out.println("Получен Арабское число, будет выглядеть - " + arabicNum);
    }
}