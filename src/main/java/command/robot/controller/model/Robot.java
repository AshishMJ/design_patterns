package command.robot.controller.model;

import command.robot.controller.enums.Direction;
import command.robot.controller.enums.Mode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Robot {
    private Position position;
    private Direction direction = Direction.NORTH;
    private Mode mode = Mode.OFF;

    public Robot() {
        position = new Position();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Robot{");
        sb.append("position=").append(position);
        sb.append(", direction=").append(direction);
        sb.append(", mode=").append(mode);
        sb.append('}');
        return sb.toString();
    }
}
