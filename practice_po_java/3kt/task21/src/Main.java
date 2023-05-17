import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа: ");
        String numpadNumbers = sc.nextLine();
        String phoneNumber = transformation(numpadNumbers);
        System.out.println(phoneNumber);
    }
    public static String transformation(String numpadNumbers) {
        Map<Character, Character> map = new HashMap<>();
        map.put('1', '1');
        map.put('2', '2');
        map.put('3', '3');
        map.put('4', '4');
        map.put('5', '5');
        map.put('6', '6');
        map.put('7', '7');
        map.put('8', '8');
        map.put('9', '9');
        map.put('0', '0');
        map.put('2', 'A');
        map.put('3', 'D');
        map.put('4', 'G');
        map.put('5', 'J');
        map.put('6', 'M');
        map.put('7', 'P');
        map.put('8', 'T');
        map.put('9', 'W');
        StringBuilder sb = new StringBuilder();
        System.out.println("Полученное преобразование: ");
        for (int i = 0; i < numpadNumbers.length(); i++) {
            char c = numpadNumbers.charAt(i);
            sb.append(map.get(c));
        }
        return sb.toString();
    }
}