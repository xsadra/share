package challenge04;

import challenge04.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PathCheckerTest {
    private PathChecker pathChecker = new PathChecker();

    @Test
    void allOppositeDirections() {
        List<Direction> directions = new ArrayList<>(
                Arrays.asList(new North(), new South(), new East(), new West()));

        List<Direction> result = pathChecker.dirReduc(directions);
        List<Direction> expected = new ArrayList<>();

        Assertions.assertEquals(expected, result);
    }

    //Input ["NORTH", "EAST", "WEST", "SOUTH", "SOUTH", "WEST"]
    //Output ["SOUTH", "WEST"]

    @Test
    void differentDirections() {
        List<Direction> directions = new ArrayList<>(
                Arrays.asList(new North(), new East(), new West(), new South(), new South(), new West()));

        List<Direction> result = pathChecker.dirReduc(directions);
        List<Direction> expected = new ArrayList<>(Arrays.asList(new South(), new West()));

        Assertions.assertEquals(expected, result);
    }

    @Test
    void differentMoreDirections() {
        List<Direction> directions = new ArrayList<>(Arrays.asList(
                new North(),
                new East(),
                new West(),
                new South(),
                new West(),
                new South(),
                new East(),
                new South(),
                new East(),
                new North()
        ));


        List<Direction> expected = new ArrayList<>(Arrays.asList(
                new West(),
                new South(),
                new East(),
                new South(),
                new East(),
                new North()
        ));


        List<Direction> actual = pathChecker.dirReduc(directions);
        Assertions.assertEquals(expected, actual);
    }
}