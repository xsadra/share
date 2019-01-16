package challenge04.model;

import java.util.Objects;

import static challenge04.model.Directions.*;

public class East implements Direction {

    private Directions name = EAST;

    @Override
    public Directions getName() {
        return name;
    }

    @Override
    public boolean defeats(Direction direction) {
        return WEST.equals(direction.getName());
    }

    @Override
    public String toString() {
        return EAST.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        East east = (East) o;
        return name == east.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
