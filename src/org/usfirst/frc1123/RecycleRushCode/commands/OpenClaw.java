package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1123.RecycleRushCode.Robot;

public class OpenClaw extends Command {

    public OpenClaw() {
        requires(Robot.lifter);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.lifter.open();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.lifter.stopClaw();
    } 

    protected void interrupted() {
    }
}
