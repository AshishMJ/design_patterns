package command.robot_controller.invoker;

import command.robot_controller.core.RobotCommand;

public class RobotActionInvoker {

    private RobotCommand robotCommand;

    public void setRobotCommand(RobotCommand robotCommand) {
        this.robotCommand = robotCommand;
    }

    public void execute() {
        robotCommand.execute();
    }
}
