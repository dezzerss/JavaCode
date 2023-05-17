public class Main {

    public static void main(String[] args) {
        String s = "aabosobcaabababa";
        System.out.println(maxSearch(s));
    }
    public static int maxSearch(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (palindrome(substring)) {
                    int length = substring.length();
                    if (length > maxLength) {
                        maxLength = length;
                    }
                }
            }
        }
        System.out.print("Длинейший палиндром будет равен - ");
        return maxLength;
    }
    public static boolean palindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}