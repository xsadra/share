package challenge04.model;

import java.util.Objects;

import static challenge04.model.Directions.*;

public class North implements Direction {

    private Directions name = NORTH;

    @Override
    public Directions getName() {
        return name;
    }

    @Override
    public boolean defeats(Direction direction) {
        return SOUTH.equals(direction.getName());
    }

    @Override
    public String toString() {
        return NORTH.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        North north = (North) o;
        return name == north.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
