package command.robot.controller.core;

import command.robot.controller.model.Robot;

public interface RobotCommand {
    void execute();
    void setRobot(Robot robot);
}
