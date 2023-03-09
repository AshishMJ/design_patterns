package command.robot_controller.core;

import command.robot_controller.enums.Mode;
import command.robot_controller.model.Robot;

public abstract class AbstractRobotCommand implements RobotCommand {
    protected Robot robot;

    @Override
    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    protected boolean isRobotTurnedOn() {
        return this.robot.getMode() == Mode.ON;
    }
}
