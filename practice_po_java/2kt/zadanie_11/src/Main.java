import java.util.Scanner;

public class Main {
    private static final char[] vowels = {'а','о','у','ы','э' ,'е' ,'ё' ,'и' ,'ю' ,'я'};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();

        String result = "";
        int check = 0;
        char checkLetter;
        for (int i = 0; i < str.length(); i++) {
            check = 0;
            checkLetter = str.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (checkLetter == vowels[j]) {
                    check++;
                    break;
                }
            }
            if (check == 0) {
                result = result + checkLetter;
            }
        }
        System.out.println("Полученная строка будет иметь вид: " + result);
    }
}

