public class checkingForUpperOrLowerCase {

    public static String check(String str){

        int sumUpp = 0;
        int sumLow = 0;
        char charStr;

        for (int i = 0;i < str.length();i++){
            charStr = str.charAt(i);
            if (charStr == Character.toUpperCase(charStr)) {
                sumUpp++;
            }else {
                sumLow++;
            }
        }

        if (sumLow >= sumUpp) {
            return (str.toLowerCase());
        }else {
            return (str.toUpperCase());
        }

    }
}
