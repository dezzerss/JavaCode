import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст:");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            char firstLetter = word.charAt(0);
            String restOfWord = word.substring(1);
            result.append(restOfWord).append(firstLetter).append("ауч ");
        }
        System.out.println("Полученная строка: " + result.toString().trim());
    }
}