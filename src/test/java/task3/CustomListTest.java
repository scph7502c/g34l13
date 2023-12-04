package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    private CustomList<Integer> customList;

    @BeforeEach
    public void setUp() {
        customList = new CustomList<>();
    }

    @Test
    public void testAddAndGet() {
        customList.add(5);
        customList.add(10);
        assertEquals(5, customList.get(0));
        assertEquals(10, customList.get(1));
    }

    @Test
    public void testRemove() {
        customList.add(15);
        customList.add(20);
        assertTrue(customList.remove(15));
        assertEquals(20, customList.get(0));
        assertEquals(1, customList.size());
    }

    @Test
    public void testSize() {
        assertEquals(0, customList.size());
        customList.add(25);
        assertEquals(1, customList.size());
        customList.add(30);
        assertEquals(2, customList.size());
        customList.remove(25);
        assertEquals(1, customList.size());
    }

    @Test
    public void testGetOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> customList.get(0));
        customList.add(35);
        assertThrows(IndexOutOfBoundsException.class, () -> customList.get(1));
    }

    @Test
    public void testRemoveNonExistingElement() {
        customList.add(40);
        assertFalse(customList.remove(50));
    }
}