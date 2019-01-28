package challenge.directions;

import java.util.Objects;

public class West implements Direction {
    private String name = "west";

    @Override
    public String getName() {

        return name;
    }

    @Override
    public boolean defeats(Direction direction) {

        return "east".equalsIgnoreCase(direction.getName());
    }

    @Override
    public String toString() {

        return "West";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        West west = (West) o;
        return Objects.equals(name, west.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
