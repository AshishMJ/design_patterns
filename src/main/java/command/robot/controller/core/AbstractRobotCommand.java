package command.robot.controller.core;

import command.robot.controller.enums.Mode;
import command.robot.controller.model.Robot;

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
