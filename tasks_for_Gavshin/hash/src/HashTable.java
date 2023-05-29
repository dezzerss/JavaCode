public class HashTable {
    private int capacity; // хранит текущую емкость хештабл
    private int size; // хранит текущее количество элементов в хештабл
    private Node[] table; // массив узлов хештабл

    public HashTable(int capacity) { // принимает начальную ёмкость и иницмализирует поля выше
        this.capacity = capacity;
        this.size = 0;
        this.table = new Node[capacity];
    }

    private int hashCode(String key) { // метод хеширования(проверка информации)
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = 31 * hash + key.charAt(i);
        }
        return Math.abs(hash);
    }

    private static class Node {
        private final String key; // хранит ключ элемента
        private final String value; // хранит значение элемента
        private Node next; // ссылка на следующий узел

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private void resize() { // Увеличение емкости массива в два раза
        capacity *= 2;
        Node[] newTable = new Node[capacity];

        for (Node node : table) { // Перехеширование элементов в новый массив
            Node current = node;
            while (current != null) {
                Node next = current.next;
                int index = hashCode(current.key) % capacity;
                current.next = newTable[index];
                newTable[index] = current;
                current = next;
            }
        }
        table = newTable;
    }

    public void put(String key, String value) {
        //добовляют новую пару ключ/значение
        int index = hashCode(key) % capacity;
        Node newNode = new Node(key, value);

        // Поиск элемента с таким же ключом
        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return; // элемент уже существует, метод возвращается
            }
            current = current.next;
        }

        // Добавление нового элемента
        newNode.next = table[index];
        table[index] = newNode;
        size++;

        // Проверка предела загрузки и изменение размера массива при необходимости
        if (size >= capacity * 0.75) {
            resize();
        }
    }

    public boolean remove(String key) {
        //удаляет элементы
        int index = hashCode(key) % capacity;
        Node current = table[index];
        Node remv = null;

        // Поиск элемента с указанным ключом
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
        // возвращает значение, связанное с указанным ключом
        int index = hashCode(key) % capacity;
        Node current = table[index];

        // Поиск элемента с указанным ключом
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null; // Элемент с указанным ключом не найден
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
