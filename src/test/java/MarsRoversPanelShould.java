import org.junit.jupiter.api.Test;
import rover.Commands;
import rover.Location;
import rover.Direction;
import rover.RoverControlPanel;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MarsRoversPanelShould {

    @Test
    public void the_rover_is_able_to_move_forward(){
        RoverControlPanel control = new RoverControlPanel();
        control.deployNewRover(0, 0, Direction.North);

        control.sendCommands(null, Commands.moveForward);

        assertThat(control.whereIsTheRover()).isEqualTo(Location.create(0, 1));
    }
}
