package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1123.RecycleRushCode.Robot;

public class StopLifter extends Command {

    public StopLifter() {
        requires(Robot.lifter);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.lifter.stop();
    	Robot.lifter.getEncCount();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    } 

    protected void interrupted() {
    }
}
