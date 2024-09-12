package kyu_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheSupermarketQueueTest {

    @Test
    public void testNormalCondition() {
        assertEquals(9, TheSupermarketQueue.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, TheSupermarketQueue.solveSuperMarketQueue(new int[] {}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(15, TheSupermarketQueue.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
    }

}