package task2;

public class CustomQueue implements OwnQueue {

    private Node head;
    private Node tail;

    private static class Node {
        private final Integer data;
        private Node next;

        Node(Integer data) {
            this.data = data;
        }
    }

    @Override
    public boolean add(Integer e) {
        Node newNode = new Node(e);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return true;
    }

    @Override
    public Integer remove() {
        if (head == null) {
            throw new IllegalStateException("Queue is empty");
        }

        Integer data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    @Override
    public Integer element() {
        if (head == null) {
            throw new IllegalStateException("Queue is empty");
        }
        return head.data;
    }
}