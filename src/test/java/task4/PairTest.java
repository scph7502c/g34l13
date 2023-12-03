package task4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PairTest {

    @Test
    public void testGetKeyAndValue() {
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        assertEquals("Age", pair.getKey());
        assertEquals(25, pair.getValue());
    }

    @Test
    public void testDifferentTypes() {
        Pair<Character, Double> pair = new Pair<>('A', 3.14);
        assertEquals('A', pair.getKey());
        assertEquals(3.14, pair.getValue());
    }

    @Test
    public void testModifyValues() {
        Pair<String, Integer> pair = new Pair<>("Count", 10);
        assertEquals("Count", pair.getKey());
        assertEquals(10, pair.getValue());

        pair = new Pair<>("Count", 15);
        assertEquals("Count", pair.getKey());
        assertEquals(15, pair.getValue());
    }
}

