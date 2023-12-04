package task3;

import java.util.Arrays;

public class CustomList<E> implements OwnList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public boolean add(E e) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size] = e;
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    @Override
    public boolean remove(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                int numMoved = size - i - 1;
                System.arraycopy(elements, i + 1, elements, i, numMoved);
                elements[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private void increaseCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}