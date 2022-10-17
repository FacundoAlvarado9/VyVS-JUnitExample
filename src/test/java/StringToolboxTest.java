import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringToolboxTest {

    private final StringToolbox strToolbox = new StringToolbox();

    @Test
    public void repeatStringTest(){
        String result = strToolbox.repeat("hola", 5);
        assertEquals(result, "holaholaholaholahola");
    }

    @Test
    public void countOccurrencesTest(){
        long result = strToolbox.countOccurrences('e', "Esternoclestomastoideo");
        assertEquals(result, 4);
    }

    @Test
    public void countOccurrencesOfNumberTest(){
        long result = strToolbox.countOccurrences('2', "Octubre de 2022");
        assertEquals(result, 3);
    }

    @Test
    public void startsWithVowelTest(){
        boolean result = strToolbox.startsWithVowel("América");
        assertTrue(result);
    }

    @Test
    public void startsWithVowelEmptyStringTest(){
        boolean result = strToolbox.startsWithVowel("");
        assertFalse(result);
    }

}
