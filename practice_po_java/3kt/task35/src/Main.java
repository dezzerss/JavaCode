import java.util.Scanner;

public class Main {
    private static final String lettersOfTheAlphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку, для преобразования: ");
        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z]", "");

        for (int shifts = 0; shifts < 26; shifts++) {
            StringBuilder decStr = new StringBuilder();
            for (char c : str.toCharArray()) {
                if (!Character.isLetter(c)) {
                    decStr.append(c);
                    continue;
                }
                int alphabetIndex = lettersOfTheAlphabet.indexOf(Character.toLowerCase(c));
                int decIdx = (alphabetIndex - shifts + 26) % 26;
                char decChar = lettersOfTheAlphabet.charAt(decIdx);
                if (Character.isUpperCase(c)) {
                    decChar = Character.toUpperCase(decChar);
                }
                decStr.append(decChar);
            }

            System.out.println("Сдвиг на " + shifts + ": " + decStr.toString());
        }
    }
}