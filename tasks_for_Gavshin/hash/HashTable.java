import java.util.NoSuchElementException;

public class HashTable<T> {
    private final int INITIAL_ACCOMMODATION = 16;
    // загрузка, при достижении которой происходит увеличение таблицы
    private final double LOADING = 0.75;

    private ListNode<T>[] table;
    private int size;
    
    public HashTable() {
        table = new ListNode[INITIAL_ACCOMMODATION];
        size = 0;
    }
    // вычисление индекса элемента в массиве table, по его ключу key
    private int hash(T key) {
        return key.hashCode() % table.length;
    }
    // метод, который увеличивает кол-во значений таблицы, после того, как превышается загрузка 
    private void resize() {
        ListNode<T>[] newTable = new ListNode[table.length * 2];
        for (int i = 0; i < table.length; i++) {
            ListNode<T> current = table[i];
            while (current != null) {
                int index = hash(current.data);
                ListNode<T> newNode = new ListNode<>(current.data);
                newNode.next = newTable[index];
                newTable[index] = newNode;
                current = current.next;
            }
        }
        table = newTable;
    }
    // метод, для добавлния элемента с ключем 
    public void put(T key) {
        if ((double) size / table.length >= LOADING) {
            resize();
        }

        int index = hash(key);
        ListNode<T> curr = table[index];
        while (curr != null) {
            if (curr.data.equals(key)) {
                return;
            }
            curr = curr.next;
        }

        ListNode<T> newNode = new ListNode<>(key);
        newNode.next = table[index];
        table[index] = newNode;
        size++;
    }
    // метод, для поиска элемента хеш таблицы, по его ключу 
    public T get(T key) {
        int index = hash(key);
        ListNode<T> curr = table[index];
        while (curr != null) {
            if (curr.data.equals(key)) {
                return curr.data;
            }
            curr = curr.next;
        }
        throw new NoSuchElementException("Key not found");
    }
    // метод, для добавление элемента, по его ключу 
    public boolean remove(T key) {
        int index = hash(key);
        ListNode<T> curr = table[index];
        if (curr == null) {
            return false;
        }
        if (curr.data.equals(key)) {
            table[index] = curr.next;
            size--;
            return true;
        }
        while (curr.next != null) {
            if (curr.next.data.equals(key)) {
                curr.next = curr.next.next;
                size--;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }



    private static class ListNode<T> {
        T data;
        ListNode<T> next;

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
