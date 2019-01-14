package oop.inheritance.parse;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeveloperParser extends AbstractParser {

    @Override
    protected Function<String[], Object> toObject() {
        return columns -> {
            Developer developer = new Developer();
            developer.setName(columns[0]);
            developer.setSpecialization(columns[1]);
            developer.setStrengths(toStrenghts(columns[2]));
            developer.setMotivation(Integer.parseInt(columns[3]));
            return developer;
        };
    }

    private Set<String> toStrenghts(String strengths) {
        String[] split = strengths.split(", ");
        return Stream.of(split)
                .map(String::trim)
                .collect(Collectors.toSet());
    }


}
