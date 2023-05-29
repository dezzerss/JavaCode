public class Main {
    public static void main(String[] args) {
        // Примеры использования
        System.out.println(funk(0));
        System.out.println(funk(1));
        System.out.println(funk(2));
        System.out.println(funk(3));
    }
    public static int funk(int n) {
        int a = 0;
        int b = 1;

        if (n == 0) {
            return a; // Возвращаем a, так как fusc(0) = 0 (уравнение 1)
        }

        if (n == 1 || n == 2) {
            return b; // Возвращаем b, так как fusc(1) = 1 и fusc(2) = 1 (уравнение 2)
        }

        while (n > 2) {
            if (n % 2 == 0) {
                n = n / 2; // Уменьшаем n в два раза, так как n четное (уравнение 3)
            } else {
                n = n - 1; // Уменьшаем n на единицу, так как n нечетное (уравнение 4)
                int temp = a; // Временная переменная для обмена значениями a и b
                a = a + b; // Обновляем a суммой a и b (уравнение 4)
                b = temp; // Присваиваем b предыдущее значение a
            }
        }

        return a + b; // Возвращаем сумму a и b, содержащую вычисленное n-е число Фуска
    }
}