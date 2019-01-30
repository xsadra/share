package challenge.timeToWord;

import java.util.Map;

public class Number {

    private static Map<Integer, String> numbersAndWords = Numbers.getNumbersAndWords();

    public static String toString(Integer number) {
        if (number < 21) {
            return numbersAndWords.get(number);
        }
        if (number.equals(30)) {
            return numbersAndWords.get(number);
        }

        Integer modulDigit = getModulDigit(number);
        Integer divDigit = getDivDigit(number);
        return numbersAndWords.get(divDigit) + " " + numbersAndWords.get(modulDigit);
    }

    private static int getModulDigit(int number) {

        return number % 10;
    }

    private static int getDivDigit(int number) {

        return number / 10 * 10;
    }
}
