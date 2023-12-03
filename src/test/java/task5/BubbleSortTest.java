package task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    public void testIntegerBubbleSort() {
        Integer[] array = {5, 3, 8, 2, 1, 4};
        Integer[] expected = {1, 2, 3, 4, 5, 8};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testStringBubbleSort() {
        String[] array = {"banana", "apple", "orange", "grape"};
        String[] expected = {"apple", "banana", "grape", "orange"};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testDoubleBubbleSort() {
        Double[] array = {3.14, 2.71, 1.1, 0.5};
        Double[] expected = {0.5, 1.1, 2.71, 3.14};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testEmptyArray() {
        Integer[] array = {};
        Integer[] expected = {};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testAlreadySortedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }
}