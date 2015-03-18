package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1123.RecycleRushCode.Robot;

public class MoveLifterDown extends Command {

    public MoveLifterDown() {
        requires(Robot.lifter);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.lifter.moveDown();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    } 

    protected void interrupted() {
    }
}
