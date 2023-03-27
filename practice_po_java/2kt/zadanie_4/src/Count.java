public class Count {
    public static int str_count(String str, char ch) {
        var i = 0;
        var result = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ch) {
                result += 1;
            }
            i++;
        }
        return result;
    }
}
