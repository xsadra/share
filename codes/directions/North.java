package challenge.directions;

import java.util.Objects;

public class North implements Direction {
    private String name = "north";

    @Override
    public String getName() {

        return name;
    }

    @Override
    public boolean defeats(Direction direction) {

        return "south".equalsIgnoreCase(direction.getName());
    }

    @Override
    public String toString() {

        return "North";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        North north = (North) o;
        return Objects.equals(name, north.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
