package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1123.RecycleRushCode.Robot;

public class DetachHooks extends Command {

    public DetachHooks() {
        requires(Robot.wings);
        setTimeout(0.5);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.wings.getFarLeft().set(-0.5);
    	Robot.wings.getLeft().set(-0.5);
    	Robot.wings.getRight().set(-0.5);
    	Robot.wings.getFarRight().set(-0.5);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.wings.getFarLeft().set(0.0);
    	Robot.wings.getLeft().set(0.0);
    	Robot.wings.getRight().set(0.0);
    	Robot.wings.getFarRight().set(0.0);

    } 

    protected void interrupted() {
    }
}
