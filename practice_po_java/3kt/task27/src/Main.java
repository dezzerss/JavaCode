import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку, для шифрования: ");
        String str = sc.nextLine();
        System.out.println("Введите число сдвига: ");
        int shiftNum = sc.nextInt();
        System.out.println("Введите направление сдвига: ");
        String theDirectionOfTheShift = sc.next();
        String encryption = "";
        for (int i = 0; i < str.length(); i++) {
            char exctract = str.charAt(i);
            if (Character.isLetter(exctract)) {
                if (theDirectionOfTheShift.equals("right")) {
                    exctract = (char) ((exctract - 'a' + shiftNum) % 26 + 'a');
                } else if (theDirectionOfTheShift.equals("left")) {
                    exctract = (char) ((exctract - 'a' - shiftNum + 26) % 26 + 'a');
                }
            }
            encryption += exctract;
        }
        System.out.println("Шифрование - " + encryption);
    }
}