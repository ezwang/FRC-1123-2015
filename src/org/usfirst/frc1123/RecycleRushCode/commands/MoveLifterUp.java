package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1123.RecycleRushCode.Robot;

public class MoveLifterUp extends Command {

    public MoveLifterUp() {
        requires(Robot.lifter);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.lifter.moveUp();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.lifter.stop();
    } 

    protected void interrupted() {
    }
}
