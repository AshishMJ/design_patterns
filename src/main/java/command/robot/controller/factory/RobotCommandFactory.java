package command.robot.controller.factory;

import command.robot.controller.exceptions.ActionNotFoundException;
import command.robot.controller.core.MoveBackward;
import command.robot.controller.core.MoveForward;
import command.robot.controller.core.RobotCommand;
import command.robot.controller.enums.RobotAction;

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
