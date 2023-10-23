package rover;

import io.vavr.control.Either;

public class Territory {

    private final int width;
    private final int height;

    private Territory(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static Territory createIn2D(int width, int height){
        return new Territory(width, height);
    }

    public Either<ImposibleLocation, OccupiedSuccess> occupyLocation(Location location) {
        if (location.exceedsLimits(width, height)){
            return Either.left(new LocationOufOfTerritory(location));
        } else if (isAlreadyOccupied(location)) {
            return Either.left(new OccupiedLocation(location));
        } else {
            markLocationAsOccupied(location);
            return Either.right(new OccupiedSuccess(location));
        }
    }

    private boolean isAlreadyOccupied(Location location) {
        // TODO: implement this
        return false;
    }

    private void markLocationAsOccupied(Location location) {
        // TODO: implement this.
    }
}
