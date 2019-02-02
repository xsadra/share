package challenge.editWords;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Word {
    public Boolean compare(String referenceWord, String currentWord) {
        if (currentWord.length() > referenceWord.length()) {
            String temp = referenceWord;
            referenceWord = currentWord;
            currentWord = temp;
        }

        String finalCurrentWord = currentWord;
        String collect = Pattern.compile("").splitAsStream(referenceWord)
                .filter(e -> !finalCurrentWord.contains(e))
                .collect(Collectors.joining());

        if (!referenceWord.equalsIgnoreCase(currentWord) && collect.length() == 0) {
            return false;
        }
        return collect.length() == 1;
    }
}
//Challenge: There are three types of edits that can be performed on strings: insert a character,
//remove a character, or replace a character. Given two strings, write a function to check if they are
//one edit (or zero edits) away.
//Example
//pale,  ple-> true
//pale,  pales -> true
//pale, bale -> true
//pale, bake -> false