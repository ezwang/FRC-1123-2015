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
    	Robot.wings.innerwing.set(-0.5);
    	Robot.wings.outerwing.set(-0.5);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.wings.stopWings();
    } 

    protected void interrupted() {
    }
}
