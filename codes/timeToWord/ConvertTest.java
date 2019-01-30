package challenge.timeToWord;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {
    Convert convert = new Convert();

    @Test
    void testOClock() {
        String result = convert.toWords(12, 0);
        Assertions.assertEquals("twelve O'CLOCK!",result);
    }

    @Test
    void testMidnight() {
        String result = convert.toWords(00, 00);
        Assertions.assertEquals("It's midnight!",result);
    }

    @Test
    void testHalfPast() {
        String result = convert.toWords(13, 30);
        Assertions.assertEquals("half past thirteen",result);
    }

    @Test
    void testMinToHour() {
        String result = convert.toWords(13, 40);
        Assertions.assertEquals("twenty to fourteen",result);
    }

    @Test
    void testMinPastHour() {
        String result = convert.toWords(13, 12);
        Assertions.assertEquals("twelve past thirteen",result);
    }

}