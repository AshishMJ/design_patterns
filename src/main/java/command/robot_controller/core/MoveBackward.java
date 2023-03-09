package command.robot_controller.core;

import command.robot_controller.enums.Direction;
import command.robot_controller.model.Position;

public class MoveBackward extends AbstractRobotCommand {

    @Override
    public void execute() {
        if (isRobotTurnedOn()) {
            Position position = robot.getPosition();
            Direction direction = robot.getDirection();
            switch (direction) {
                case NORTH:
                    if (position.getYPos() != 0) {
                        position.setYPos(position.getYPos() - 1);
                    }
                    break;
                case SOUTH:
                    position.setYPos(position.getYPos() + 1);
                    break;
                case EAST:
                    if (position.getXPos() != 0) {
                        position.setYPos(position.getXPos() - 1);
                    }
                    break;
                case WEST:
                    position.setXPos(position.getXPos() + 1);
                    break;
            }
            System.out.println(position);
        } else {
            System.out.println("Robot is in OFF mode. Turn ON the Robot to take commands.");
        }
    }
}
