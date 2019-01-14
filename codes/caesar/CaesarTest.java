package ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CaesarTest {

    private Caesar caesar = new Caesar();

    @Test
    void encrypt() {
        String expected = "Ifmmp";
        String actual = caesar.encrypt("Hello", 1);
        Assertions.assertEquals(expected, actual);
    }
}