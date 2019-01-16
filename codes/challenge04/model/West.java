package challenge04.model;

import java.util.Objects;

import static challenge04.model.Directions.*;

public class West implements Direction {

    private Directions name = WEST;

    @Override
    public Directions getName() {
        return name;
    }

    @Override
    public boolean defeats(Direction direction) {
        return EAST.equals(direction.getName());
    }

    @Override
    public String toString() {
        return WEST.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        West west = (West) o;
        return name == west.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
