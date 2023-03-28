package fr.assia.javacustomutils;

import fr.assia.javacustomutils.string.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void toUpperCaseFirstCharTest_ok () {
        String testStr = "i am a simple string !";
        assertEquals("I am a simple string !", StringUtils.toUpperCaseFirstChar(testStr));
    }

    @Test
    void isEmptyTest_notEmpty() {
        assertFalse(StringUtils.isEmpty("a simple string"));
    }
    @Test
    void isEmptyTest_empty() {
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    void isEmptyTest_null() {
        assertTrue(StringUtils.isEmpty(null));
    }

}
