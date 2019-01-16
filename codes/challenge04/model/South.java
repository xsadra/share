package challenge04.model;


import java.util.Objects;

import static challenge04.model.Directions.*;

public class South implements Direction {

    private Directions name = SOUTH;

    @Override
    public Directions getName() {
        return name;
    }

    @Override
    public boolean defeats(Direction direction) {
        return NORTH.equals(direction.getName());
    }

    @Override
    public String toString() {
        return name.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        South south = (South) o;
        return name == south.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
