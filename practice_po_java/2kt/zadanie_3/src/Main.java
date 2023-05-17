import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты трех точек через запятую, в формате ([x1, y1], [x2, y2], [x3, y3]): ");
        String input = scanner.nextLine();
        input = input.replaceAll("[\\[\\]\\[\\] ]", ""); // удаляем скобки и пробелы
        String[] coordinates = input.split(","); // разделяем координаты
        int x1 = Integer.parseInt(coordinates[0]);
        int y1 = Integer.parseInt(coordinates[1]);
        int x2 = Integer.parseInt(coordinates[2]);
        int y2 = Integer.parseInt(coordinates[3]);
        int x3 = Integer.parseInt(coordinates[4]);
        int y3 = Integer.parseInt(coordinates[5]);

        // Рассчитываем координаты медиан
        double medX1 = (x2 + x3) / 2.0;
        double medY1 = (y2 + y3) / 2.0;
        double medX2 = (x1 + x3) / 2.0;
        double medY2 = (y1 + y3) / 2.0;
        double medX3 = (x1 + x2) / 2.0;
        double medY3 = (y1 + y2) / 2.0;

        // Рассчитываем координаты барицентра
        double barX = (medX1 + medX2 + medX3) / 3.0;
        double barY = (medY1 + medY2 + medY3) / 3.0;

        // Выводим результат
        System.out.printf("Барицентр будет равен - " + "{%.4f, %.4f}", barX, barY);
        }
    }
