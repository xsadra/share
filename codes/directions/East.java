package challenge.directions;

import java.util.Objects;

public class East implements Direction {
    private String name = "east";

    @Override
    public String getName() {

        return name;
    }

    @Override
    public boolean defeats(Direction direction) {

        return "west".equalsIgnoreCase(direction.getName());
    }

    @Override
    public String toString() {

        return "East";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        East east = (East) o;
        return Objects.equals(name, east.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
