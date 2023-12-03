package task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomHashMapTest {

    private CustomHashMap customHashMap;

    @BeforeEach
    public void setUp() {
        customHashMap = new CustomHashMap();
    }

    @Test
    public void testPutAndGet() {
        customHashMap.put("key1", "value1");
        assertEquals("value1", customHashMap.get("key1"));
    }

    @Test
    public void testContainsKey() {
        customHashMap.put("key2", "value2");
        assertTrue(customHashMap.containsKey("key2"));
        assertFalse(customHashMap.containsKey("key3"));
    }

    @Test
    public void testContainsValue() {
        customHashMap.put("key4", "value4");
        assertTrue(customHashMap.containsValue("value4"));
        assertFalse(customHashMap.containsValue("value5"));
    }

    @Test
    public void testRemove() {
        customHashMap.put("key6", "value6");
        assertEquals("value6", customHashMap.remove("key6"));
        assertNull(customHashMap.get("key6"));
    }

    @Test
    public void testOverwriteExistingKey() {
        customHashMap.put("key7", "value7");
        assertEquals("value7", customHashMap.get("key7"));
        customHashMap.put("key7", "newValue");
        assertEquals("newValue", customHashMap.get("key7"));
    }
}