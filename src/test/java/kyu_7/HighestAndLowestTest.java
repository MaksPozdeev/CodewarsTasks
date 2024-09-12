package kyu_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class HighestAndLowestTest {

    @Test
    public void highAndLow_test(){
        assertEquals("5 1", HighestAndLowest.highAndLow("1 2 3 4 5"));
        assertEquals("5 -3",HighestAndLowest.highAndLow("1 2 -3 4 5"));
        assertEquals("9 -5",HighestAndLowest.highAndLow("1 9 3 4 -5"));
    }

}