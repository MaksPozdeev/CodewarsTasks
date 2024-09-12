package kyu_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelCountTest {

    @Test
    public void getCount_test(){
        assertEquals(5,VowelCount.getCount("aeiou"));
        assertEquals(4,VowelCount.getCount("qwe irotru"));
        assertEquals(5,VowelCount.getCount("bab ebibou"));
        assertEquals(3,VowelCount.getCount("ddag out"));
    }

}