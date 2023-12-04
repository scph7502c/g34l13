package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomQueueTest {

    private CustomQueue customQueue;

    @BeforeEach
    public void setUp() {
        customQueue = new CustomQueue();
    }

    @Test
    public void testAddAndElement() {
        customQueue.add(5);
        assertEquals(5, customQueue.element());
    }

    @Test
    public void testAddAndRemove() {
        customQueue.add(10);
        customQueue.add(20);
        assertEquals(10, customQueue.remove());
        assertEquals(20, customQueue.remove());
    }

    @Test
    public void testRemoveFromEmptyQueue() {
        assertThrows(IllegalStateException.class, () -> customQueue.remove());
    }

    @Test
    public void testElementFromEmptyQueue() {
        assertThrows(IllegalStateException.class, () -> customQueue.element());
    }

    @Test
    public void testAddRemoveAddElement() {
        customQueue.add(15);
        assertEquals(15, customQueue.remove());
        customQueue.add(25);
        assertEquals(25, customQueue.element());
    }
}