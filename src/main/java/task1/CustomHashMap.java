package task1;

public class CustomHashMap implements OwnMap {

    private static final int INITIAL_CAPACITY = 16;
    private Node[] buckets;

    public CustomHashMap() {
        buckets = new Node[INITIAL_CAPACITY];
    }

    @Override
    public boolean put(String key, String value) {
        int index = getIndex(key);
        Node newNode = new Node(key, value);

        if (buckets[index] == null) {
            buckets[index] = newNode;
        } else {
            Node current = buckets[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return true;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value;
                return true;
            }
            current.next = newNode;
        }
        return true;
    }

    @Override
    public boolean containsKey(String key) {
        int index = getIndex(key);
        Node current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Node bucket : buckets) {
            Node current = bucket;
            while (current != null) {
                if (current.value.equals(value)) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public String remove(String key) {
        int index = getIndex(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return current.value;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }

    @Override
    public String get(String key) {
        int index = getIndex(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    private int getIndex(String key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    private static class Node {
        private final String key;
        private String value;
        private Node next;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}