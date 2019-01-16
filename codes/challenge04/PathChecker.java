package challenge04;

import challenge04.model.Direction;

import java.util.ArrayList;
import java.util.List;

public class PathChecker {
    public List<Direction> dirReduc(List<Direction> directions) {

        if (directions.size() < 2) {
            return directions;
        }

        List<Direction> result = new ArrayList<>(directions);
        int listSize, position = 0;

        do {
            position = check(result, position);

            listSize = result.size();
        } while (position < listSize - 1);

        return result;
    }

    private int check(List<Direction> result, int position) {
        Direction current = result.get(position);
        Direction next = result.get(position + 1);


        if (current.equals(next)) {
            result.remove(position);
        }

        if (!current.defeats(next)) {
            return ++position;
        }

        removeBothDirections(result, position);
        
        if (position != 0) {
            position--;
        }

        return position;
    }

    private void removeBothDirections(List<Direction> directionsList, int position) {
        directionsList.remove(position);
        directionsList.remove(position);
    }

}
