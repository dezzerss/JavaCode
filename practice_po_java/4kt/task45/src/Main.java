import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Арабское число: ");
        int arabicNum = sc.nextInt();

        if (arabicNum < 1 || arabicNum > 9999) {
            System.out.println("Неверно указано число!");
            return;
        }

        String[] romanThousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuilder romanNum = new StringBuilder();
        romanNum.append(romanThousands[arabicNum / 1000]);
        romanNum.append(hundreds[(arabicNum % 1000) / 100]);
        romanNum.append(tens[(arabicNum % 100) / 10]);
        romanNum.append(ones[arabicNum % 10]);

        System.out.println("Полученное Римское, будет выглядеть - " + romanNum);
    }
}