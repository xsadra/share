package challenge.directions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PathChecker {
    public List<Direction> analyzePath(List<Direction> directions) {

        int listSize = directions.size();

        if (listSize == 0) {
            return new ArrayList<>();
        }

        if (listSize == 1) {
            return directions;
        }

        int position = 0;

        while (position < listSize - 1) {
            Direction direction1 = directions.get(position);
            Direction direction2 = directions.get(position + 1);

            if (direction1.defeats(direction2)) {
                directions = removeBothDirections(directions, position);
                if (position != 0) {
                    position--;
                }
            } else {
                position++;
            }

            listSize = directions.size();
        }

        return directions;
    }

    private List<Direction> removeBothDirections(List<Direction> directions, int position) {
        directions.remove(position);
        directions.remove(position);

        return directions;
    }
}
