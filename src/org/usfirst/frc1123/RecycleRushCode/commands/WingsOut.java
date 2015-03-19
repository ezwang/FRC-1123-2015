package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1123.RecycleRushCode.Robot;

public class WingsOut extends Command {

    public WingsOut() {
        requires(Robot.wings);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.wings.extendRightWings();
    	Robot.wings.extendLeftWings();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    } 

    protected void interrupted() {
    }
}
