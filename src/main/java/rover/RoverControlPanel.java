package rover;

import io.vavr.control.Either;

public class RoverControlPanel {
    public Either<DeploymentFailure, Rover> deployNewRover(int x, int y, Direction direction) {
        Either<ImposibleCoordinate, Coordinate> coordinate = Coordinate.create(x, y);

        return coordinate
                .map(c -> new Rover(c, direction))
                .mapLeft(DeploymentFailure::new);
    }


    public void sendCommands(Rover rover, Commands... commands) {

    }

    public Coordinate whereIsTheRover() {
        return null;// return Coordinate.create(0, 1);
    }
}
