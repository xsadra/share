package challenge.directions;

import java.util.*;

public class Directions {
    private static Set<Direction> directions = new HashSet<>(
            Arrays.asList(new East(), new North(), new South(), new West()));

    public static String asString() {
        List<String> names = new ArrayList<>();
        for (Direction direction : directions) {
            names.add(direction.getName());
        }
        return String.join(", ", names);
    }

    public static Optional<Direction> get(String directionName) {
        for (Direction direction : directions) {
            if (direction.getName().equalsIgnoreCase(directionName)) {
                return Optional.of(direction);
            }
        }
        return Optional.empty();
    }

    public static List<Direction> asList() {

        return new ArrayList<>(directions);
    }
}
