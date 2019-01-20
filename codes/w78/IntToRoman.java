package w78;

import java.util.*;

public class IntToRoman {

    public String getRoman(Integer number) {
        List<Map.Entry<Integer, String>> romansList = getRomansList();

        if (number > 3999 || number < 1) System.out.println("Out of range");

        StringBuilder numeral = new StringBuilder();
        int index = 0;
        while (number > 0) {
            if (number - romansList.get(index).getKey() >= 0) {
                numeral.append(romansList.get(index).getValue());
                number -= romansList.get(index).getKey();
            } else {
                index++;
            }
        }
        return numeral.toString();

    }

    private Map<Integer, String> getRomansTable() {
        Map<Integer, String> romans = new HashMap<>();
        romans.put(1000, "M");
        romans.put(900, "CM");
        romans.put(500, "D");
        romans.put(400, "CD");
        romans.put(100, "C");
        romans.put(90, "XC");
        romans.put(50, "L");
        romans.put(40, "XL");
        romans.put(10, "X");
        romans.put(9, "IX");
        romans.put(5, "V");
        romans.put(4, "IV");
        romans.put(1, "I");
        return romans;
    }

  private List<Map.Entry<Integer,String>>  getRomansList() {
      List<Map.Entry<Integer,String>>  romans = new ArrayList<>();

        romans.add(new AbstractMap.SimpleEntry<>(1000, "M"));
        romans.add(new AbstractMap.SimpleEntry<>(500, "D"));
        romans.add(new AbstractMap.SimpleEntry<>(400, "CD"));
        romans.add(new AbstractMap.SimpleEntry<>(100, "C"));
        romans.add(new AbstractMap.SimpleEntry<>(90, "XC"));
        romans.add(new AbstractMap.SimpleEntry<>(50, "L"));
        romans.add(new AbstractMap.SimpleEntry<>(40, "XL"));
        romans.add(new AbstractMap.SimpleEntry<>(10, "X"));
        romans.add(new AbstractMap.SimpleEntry<>(9, "IX"));
        romans.add(new AbstractMap.SimpleEntry<>(5, "V"));
        romans.add(new AbstractMap.SimpleEntry<>(4, "IV"));
        romans.add(new AbstractMap.SimpleEntry<>(1, "I"));
        return romans;
    }


}
