package reflection.week09;

import reflection.week09.reader.FileReader;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentPerformances {

    static List<String> students = new FileReader().asList("reflection/week09/data/students-performance.csv");

    public static void main(String[] args) {
        long count = students.stream().skip(1).count();


        Map<String, Long> gender = students.stream()
                .skip(1)
                .map(s -> s.split(";")[0])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Set<String> education = students.stream()
                .skip(1)
                .map(s -> s.split(";")[1])
                .collect(Collectors.toSet());


        long scoreHigherThan90 = students.stream()
                .skip(1)
                .map(s -> s.split(";"))
                .filter(scoreHigherThan(90))
                .count();


        List<String> scoreHigherThan100 = students.stream()
                .skip(1)
                .map(s -> s.split(";"))
                .filter(scoreEqualTo(100))
                .map(strings -> strings[0])
                .collect(Collectors.toList());



        System.out.println("Total number of student performance entries: " + count);

        System.out.println("Number of female students: " + gender.get("female"));
        System.out.println("Number of male students: " + gender.get("male"));


        System.out.println("Parental education levels sorted alphabetically:\n" + education);

        System.out.println("Number of students with scores higher than 90: " + scoreHigherThan90);

        System.out.println("Number of students with scores equal to 100: " + scoreHigherThan100.size());
        System.out.println("Genders of these students are: " + scoreHigherThan100);

    }

    private static Predicate<? super String[]> scoreEqualTo(int limit) {
        return strings -> {
            if (Integer.valueOf(strings[2]) != limit) {
                return false;
            }
            if (Integer.valueOf(strings[3]) != limit) {
                return false;
            }

            return Integer.valueOf(strings[4]) == limit;
        };
    }

    private static Predicate<? super String[]> scoreHigherThan(int limit) {
        return strings -> {
            if (Integer.valueOf(strings[2]) < limit + 1) {
                return false;
            }
            if (Integer.valueOf(strings[3]) < limit + 1) {
                return false;
            }

            return Integer.valueOf(strings[4]) >= limit + 1;
        };
    }

}
