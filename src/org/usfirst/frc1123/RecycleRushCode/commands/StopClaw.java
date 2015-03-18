package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1123.RecycleRushCode.Robot;

public class StopClaw extends Command {

    public StopClaw() {
        requires(Robot.lifter);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.lifter.stopClaw();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    } 

    protected void interrupted() {
    }
}
