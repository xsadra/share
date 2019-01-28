package challenge.directions;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class PathCheckerTest {
    PathChecker pathChecker = new PathChecker();

    @Test
    void allOppositeDirections() {
        List<Direction> directions = new ArrayList<>(
                Arrays.asList(new North(), new South(), new East(), new West()));

        List<Direction> result = pathChecker.analyzePath(directions);
        Optional<List<Direction>> expected = Optional.of(new ArrayList<>());
        Assertions.assertEquals(expected, result);
    }

    @Test
    void differentDirections() {
        List<Direction> directions = new ArrayList<>(
                Arrays.asList(new North(), new East(), new West(), new South(), new South(), new West()));

        List<Direction> result = pathChecker.analyzePath(directions);
        List<Direction> expected = new ArrayList<>(Arrays.asList(new South(), new West()));

        Assertions.assertEquals(expected, result);
    }
}