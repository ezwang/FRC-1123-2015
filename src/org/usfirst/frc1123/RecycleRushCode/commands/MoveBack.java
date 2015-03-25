package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1123.RecycleRushCode.Robot;
import org.usfirst.frc1123.RecycleRushCode.RobotMap;

public class MoveBack extends Command {

    public MoveBack() {
        requires(Robot.drivetrain);
//        setTimeout(0.1);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.back();
   	}

    protected boolean isFinished() {
//    	return isTimedOut();
    	return false;
    }

    protected void end() {
    	Robot.drivetrain.stop();
    } 

    protected void interrupted() {
    	Robot.drivetrain.stop();
    }
}
