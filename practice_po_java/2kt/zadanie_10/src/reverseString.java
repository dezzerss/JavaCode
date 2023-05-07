public class reverseString {
    public static String reverseStr(String str) {
        String result = "";
        for (int i = 0;i < str.length();i++) {
            result = Character.toLowerCase(str.charAt(i)) + result;
        }
        return "Привет, " + result + "!";
    }
}
