package command.robot_controller.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Position {
    private int xPos = 0;
    private int yPos = 0;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CurrentPosition{");
        sb.append("xPos=").append(xPos);
        sb.append(", yPos=").append(yPos);
        sb.append('}');
        return sb.toString();
    }
}
