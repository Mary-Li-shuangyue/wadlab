package lecture.unittesting;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestArrayIntList {

	@Test
    public void testAddGet1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(-13);
        list.add(10);
        assertEquals(12, list.get(0).intValue());
        assertEquals(-13, list.get(1).intValue());
        assertEquals(10, list.get(2).intValue());
    }

    @Test
    public void testIsEmpty() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        assertTrue(list.isEmpty());
        list.add(123);
        assertFalse(list.isEmpty());
        list.remove(0);
        assertTrue(list.isEmpty());
    }
}
