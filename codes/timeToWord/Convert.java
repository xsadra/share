package challenge.timeToWord;

import java.util.Map;

public class Convert {
    private Map<Integer, String> numbersAndWords = Numbers.getNumbersAndWords();

    public String toWords(Integer hour, Integer minute) {

        if (minute.equals(0)) {
            return getOclock(hour);
        }

        if (minute <= 30) {
            return Number.toString(minute) + " past " + Number.toString(hour);
        }

        int remainedMinute = 60 - minute;
        return Number.toString(remainedMinute) + " to " + Number.toString(hour + 1);
    }

    private String getOclock(Integer hour) {
        if (hour.equals(0)) {
            return "It's midnight!";
        }

        return Number.toString(hour) + " O'CLOCK!";
    }
}
