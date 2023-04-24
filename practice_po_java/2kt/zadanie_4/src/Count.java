public class Count {
    public static int strCount(String str, char symbol) {
        int i = 0;
        int result = 0;
        while (i < str.length()) {
            if (str.charAt(i) == symbol) {
                result += 1;
            }
            i++;
        }
        System.out.print("Символ был употреблен в строке: ");
        return result;
    }
}
