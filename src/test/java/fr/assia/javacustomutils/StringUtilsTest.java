package fr.assia.javacustomutils;

import fr.assia.javacustomutils.string.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    void upperCaseFirstCharTest_ok () {
        String testStr = "i am a simple string !";
        assertEquals("I am a simple string !", StringUtils.upperCaseFirstChar(testStr));
    }
}
