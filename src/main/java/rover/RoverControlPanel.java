package rover;

import io.vavr.control.Either;

public class RoverControlPanel {

    private final Territory territory;

    public RoverControlPanel(Territory territory){

        this.territory = territory;
    }

    public Either<DeploymentFailure, Rover> deployNewRover(Location location, Direction direction) {
        Either<ImposibleLocation, OccupiedSuccess> occupationResult = territory.occupyLocation(location);
        return occupationResult
                .map(success -> new Rover(location, direction))
                .mapLeft(DeploymentFailure::new);
    }


    public void sendCommands(Rover rover, Commands... commands) {

    }

    public Location whereIsTheRover() {
        return null;// return Coordinate.create(0, 1);
    }
}
