import org.Rifqi.Entity.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverseWord() {
        assertEquals("dcba", StringUtils.reverseWord("abcd"));
        assertEquals("olleh", StringUtils.reverseWord("hello"));
    }

    @Test
    void countVowel() {
        assertEquals(2, StringUtils.countVowel("hello"));
        assertEquals(5, StringUtils.countVowel("aeiou"));
        assertEquals(0, StringUtils.countVowel("bcdfg"));

    }

    @Test
    void isAnagram() {
        assertTrue(StringUtils.isAnagram("listen", "silent"));
        assertTrue(StringUtils.isAnagram("evil", "vile"));
        assertFalse(StringUtils.isAnagram("hello", "world"));

    }
}
