package challenge.editWords;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class WordTest {
    private List<String> expectedTrue = Arrays.asList("sahdr,sadr", "abc,abcd", "sahar,saar", "saar,sahar");
    private List<String> expectedFalse = Arrays.asList("abcde,bbcd", "abcd,bbc", "mahmoo,sahar", "mahmood,sara");

    private Word word = new Word();

    @Test
    void testExpectedTrueCases() {
        for (String pair : expectedTrue) {
            String[] split = pair.split(",");
            Boolean result = word.compare(split[0], split[1]);
            Assertions.assertTrue(result);
        }
    }

    @Test
    void testExpectedFalseCases() {
        for (String pair : expectedFalse) {
            String[] split = pair.split(",");
            Boolean result = word.compare(split[0], split[1]);
            Assertions.assertFalse(result);
        }
    }

    @Test
    void testInsert() {
        Boolean result = word.compare("pale", "ple");
        Assertions.assertTrue(result);
    }

    @Test
    void testRemove() {
        Boolean result = word.compare("pale", "pales");
        Assertions.assertTrue(result);
    }

    @Test
    void testReplace() {
        Boolean result = word.compare("pale", "bale");
        Assertions.assertTrue(result);
    }

    @Test
    void testfalse() {
        Boolean result = word.compare("pale", "bake");
        Assertions.assertFalse(result);
    }
}