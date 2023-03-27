public class reverse {
    public static String reverseText(String str) {
        int i = 0;
        String result = "";
        while (i < str.length()) {
            result = str.charAt(i) + result;
            i++;
        }
        return "Привет, " + result + "!";
    }
}
