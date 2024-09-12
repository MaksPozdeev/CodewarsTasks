package kyu_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetTheMiddleCharacterTest {

    @Test
    public void getMiddle_test(){
        assertEquals("es",GetTheMiddleCharacter.getMiddle("test"));
        assertEquals("t",GetTheMiddleCharacter.getMiddle("testing"));
        assertEquals("dd",GetTheMiddleCharacter.getMiddle("middle"));
        assertEquals("A",GetTheMiddleCharacter.getMiddle("A"));
    }

}