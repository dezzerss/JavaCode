public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(16);

        hashTable.put("key1", "1");
        hashTable.put("key2", "432");
        hashTable.put("key3", "324");
        hashTable.put("key4", "23");
        hashTable.put("key5", "2233");

        hashTable.remove("key3");

        System.out.println(hashTable.get("key2"));

        System.out.println("Полученная Хеш-Таблица: ");
        for (String key : hashTable.keys()) {
            System.out.println("Key: " + key + ", Value: " + hashTable.get(key));
        }
    }
}

