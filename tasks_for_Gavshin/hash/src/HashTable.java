public class HashTable {
    private int capacity; 
    private int size; 
    private Node[] table; 

    public HashTable(int capacity) { 
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

    private void resize() { // увеличение емкости массива в два раза, при достижении предела
        capacity *= 2;
        Node[] newTable = new Node[capacity];

        for (Node node : table) { // перехеширование элементов в новый массив
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
        int index = hashCode(key) % capacity;
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
        if (size >= capacity * 0.75) {
            resize();
        }
    }

    public boolean remove(String key) {        
        int index = hashCode(key) % capacity;
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
        int index = hashCode(key) % capacity;
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
