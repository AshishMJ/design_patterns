package command.robot_controller.core;

import command.robot_controller.model.Robot;

public interface RobotCommand {
    void execute();
    void setRobot(Robot robot);
}
