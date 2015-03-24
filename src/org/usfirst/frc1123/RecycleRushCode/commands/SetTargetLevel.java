package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1123.RecycleRushCode.Robot;

public class SetTargetLevel extends Command {

//	int n;
	
    public SetTargetLevel() {
//        requires(Robot.lifter);
//    	n = setto;
    	System.out.println("----------------------------RUNNING---------------------------");
//    	Robot.lifter.close();
    	try {
    	Robot.oi.curLevel += 1;
    	}
    	catch (Exception e) {}

    }

    protected void initialize() {
    }

    protected void execute() {
    	
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
