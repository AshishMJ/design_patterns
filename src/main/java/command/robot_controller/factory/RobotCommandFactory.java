package command.robot_controller.factory;

import command.robot_controller.exceptions.ActionNotFoundException;
import command.robot_controller.core.MoveBackward;
import command.robot_controller.core.MoveForward;
import command.robot_controller.core.RobotCommand;
import command.robot_controller.enums.RobotAction;

public class RobotCommandFactory {

    private RobotCommandFactory() {
    }

    public static RobotCommand getCommand(RobotAction robotAction) {
        RobotCommand command;
        switch (robotAction) {
            case MF:
                command = new MoveForward();
                break;
            case MB:
                command = new MoveBackward();
                break;
            default:
                throw new ActionNotFoundException();
        }
        return command;
    }

    public static RobotCommand getRevertCommand(RobotAction robotAction) {
        RobotCommand command;
        switch (robotAction) {
            case MF:
                command = new MoveBackward();
                break;
            case MB:
                command = new MoveForward();
                break;
            default:
                throw new ActionNotFoundException();
        }
        return command;
    }
}
