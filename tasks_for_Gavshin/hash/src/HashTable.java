public class HashTable {
    private final int CAPACITY = 10;
    private final double LOAD = 0.75;
    private int size;
    private Node[] table;

    public HashTable(int CAPACITY) {
        this.size = 0;
        this.table = new Node[CAPACITY];
    }

    private int hashCode(String key) { // метод хеширования(проверка информации)
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = 31 * hash + key.charAt(i);
        }
        return Math.abs(hash);
    }

    private static class Node {
        // хранение данных
        private final String key;
        private final String value;
        private Node next;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private void resize() {
        Node[] newTable = new Node[CAPACITY];

        for (Node node : table) { // перехеширование элементов в новый массив
            Node current = node;
            while (current != null) {
                Node next = current.next;
                int index = hashCode(current.key) % CAPACITY;
                current.next = newTable[index];
                newTable[index] = current;
                current = next;
            }
        }
        table = newTable;
    }

    public void put(String key, String value) {

        if ((double) size / table.length >= LOAD) {
            resize();
        }

        int index = hashCode(key) % table.length;
        Node newNode = new Node(key, value);

        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return; // элемент уже существует, метод возвращается
            }
            current = current.next;
        }

        newNode.next = table[index];
        table[index] = newNode;
        size++;

        // Проверка предела загрузки и изменение размера массива при необходимости
        if (size >= CAPACITY * 0.75) {
            resize();
        }
    }

    public boolean remove(String key) {
        int index = hashCode(key) % table.length;
        Node current = table[index];
        Node remv = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (remv != null) {
                    remv.next = current.next;
                } else {
                    table[index] = current.next;
                }
                size--;
                return true;
            }
            remv = current;
            current = current.next;
        }
        return false; // Элемент с указанным ключом не найден
    }

    public String get(String key) {
        // возвращает значение, по нашему ключу
        int index = hashCode(key) % table.length;
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // Если элемент с указанным ключем не найден, программа выведет null
    }

    public String[] keys() {
        String[] keys = new String[size];
        int index = 0;
        for (Node node : table) {
            Node current = node;
            while (current != null) {
                keys[index] = current.key;
                index++;
                current = current.next;
            }
        }
        return keys;
    }
}
