package command.robot.controller;

import command.robot.controller.enums.RobotAction;
import command.robot.controller.model.Robot;
import org.junit.Test;

public class TestRobotController {

    @Test
    public void testMoveFwd() {
        Robot robot = new Robot();
        RobotController controller = new RobotController(robot);
        controller.turnOn();
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MF);
    }

    @Test
    public void testMoveBack() {
        Robot robot = new Robot();
        RobotController controller = new RobotController(robot);
        controller.turnOn();
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MB);
        controller.submitAction(RobotAction.MB);
        controller.submitAction(RobotAction.MB);
    }

    @Test
    public void testUndo() {
        Robot robot = new Robot();
        RobotController controller = new RobotController(robot);
        controller.turnOn();
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.UNDO);
        controller.submitAction(RobotAction.UNDO);
        controller.submitAction(RobotAction.UNDO);
    }


}
