package kyu_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveFirstAndLastCharacterTest {

    @Test
    public void remove_Test(){
        assertEquals("wert", RemoveFirstAndLastCharacter.remove("qwerty"));
    }

}