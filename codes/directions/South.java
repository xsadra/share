package challenge.directions;

import java.util.Objects;

public class South implements Direction {

    private String name = "south";

    @Override
    public String getName() {

        return name;
    }

    @Override
    public boolean defeats(Direction direction) {

        return "north".equalsIgnoreCase(direction.getName());
    }

    @Override
    public String toString() {

        return "South";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        South south = (South) o;
        return Objects.equals(name, south.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
