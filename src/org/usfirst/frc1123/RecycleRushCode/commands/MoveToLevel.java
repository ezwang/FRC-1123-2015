package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1123.RecycleRushCode.Robot;

public class MoveToLevel extends Command {

//	int n;
	
    public MoveToLevel() {
    	requires(Robot.lifter);
    }

    protected void initialize() {
    }

    protected void execute() {
    	System.out.println("Moving claw to level" + Robot.oi.moveToLevel.getSelected());    	
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
//    	Robot.lifter.stopClaw();
    } 

    protected void interrupted() {
    }
}
