import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        hashTable.put("key1", "1");
        hashTable.put("key2", "432");
        hashTable.put("key3", "324");
        hashTable.put("key4", "23");

        hashTable.remove("key3");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите команду, для дальнейших действий (Таблица, Добавить, Удалить, Выйти): ");
        String command = sc.nextLine();
        if (command.equalsIgnoreCase("Таблица")) {
            displayHashTable(hashTable);
        } else if (command.equalsIgnoreCase("Добавить")) {
            addElement(hashTable);
        } else if (command.equalsIgnoreCase("Удалить")) {
            removeElement(hashTable);
        } else if (command.equalsIgnoreCase("Выйти")) {
            System.out.println("Всего хорошего");
        } else {
            System.out.println("Неверная команда");
        }
    }
    private static void removeElement(HashTable hashTable) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ключ элемента для удаления: ");
        String key = scanner.nextLine();
        boolean removed = hashTable.remove(key);
        if (removed) {
            System.out.println("Элемент удален");
        } else {
            System.out.println("Элемент не найден");
        }
    }
    private static void addElement(HashTable hashTable) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ключ: ");
        String key = scanner.nextLine();
        System.out.print("Введите значение: ");
        String value = scanner.nextLine();
        hashTable.put(key, value);
        System.out.println("Элемент добавлен");
    }
    private static void displayHashTable(HashTable hashTable) {
        for (String key : hashTable.keys()) {
            System.out.println("Key: " + key + ", Value: " + hashTable.get(key));
        }
    }
}

