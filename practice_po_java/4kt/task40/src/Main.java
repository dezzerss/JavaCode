import java.util.ArrayList;
import java.util.List;
import static java.lang.String.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        System.out.println(format(numbers)); // вывод полученного списка
    }

    public static String format(int[] num) {
        List<String> ranges;
        ranges = new ArrayList<>();
        int start = num[0];
        int prev = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] == prev + 1) {
                prev = num[i];
            } else {
                ranges.add(getRange(start, prev));
                start = num[i];
                prev = num[i];
            }
        }
        ranges.add(getRange(start, prev));
        return join(",", ranges);
    }

    private static String getRange(int start, int end) {
        if (start == end) {
            return Integer.toString(start);
        } else {
            return start + "-" + end;
        }
    }
}