package rover;

import io.vavr.control.Either;

import java.util.Objects;

public class Coordinate {
    private int x;
    private int y;

    private Coordinate(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public static Either<ImposibleCoordinate, Coordinate> create(int x, int y) {
        return Either.right(new Coordinate(x, y));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
