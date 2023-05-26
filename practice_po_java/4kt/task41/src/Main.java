import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во секунд: ");
        int seconds = sc.nextInt();
        System.out.println("Полученный формат времени - " + formatTime(seconds));
    }

    public static String formatTime(int seconds) {
        int year = seconds / (365*24*60*60);
        seconds %= 365*24*60*60;
        int month = seconds / (30*24*60*60);
        seconds %= 30*24*60*60;
        int week = seconds / (7*24*60*60);
        seconds %= 7*24*60*60;
        int day = seconds / (24*60*60);
        seconds %= 24*60*60;
        int hour = seconds / (60*60);
        seconds %= 60*60;
        int minute = seconds / 60;
        seconds %= 60;

        StringBuilder sb = new StringBuilder();
        if (year > 0) {
            sb.append(year).append(" год");
            if (year > 1) {
                sb.append("а");
            }
            sb.append(", ");
        }
        if (month > 0) {
            sb.append(month).append(" месяц");
            if (month > 1) {
                sb.append("а");
            }
            sb.append(", ");
        }
        if (week > 0) {
            sb.append(week).append(" недел");
            if (week == 1) {
                sb.append("ю");
            } else if (week > 1 && week < 5) {
                sb.append("и");
            } else {
                sb.append("ь");
            }
            sb.append(", ");
        }
        if (day > 0) {
            sb.append(day).append(" день, ");
        }
        if (hour > 0) {
            sb.append(hour).append(" час");
            if (hour > 1) {
                sb.append("а");
            }
            sb.append(", ");
        }
        if (minute > 0) {
            sb.append(minute).append(" минут");
            if (minute == 1) {
                sb.append("а");
            } else if (minute > 1 && minute < 5) {
                sb.append("ы");
            } else {
                sb.append("");
            }
            sb.append(" и ");
        }
        sb.append(seconds).append(" секунд");
        if (seconds == 1) {
            sb.append("у");
        } else if (seconds > 1 && seconds < 5) {
            sb.append("ы");
        } else {
            sb.append("");
        }
        return sb.toString();
    }
}