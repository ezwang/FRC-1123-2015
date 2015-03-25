package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1123.RecycleRushCode.Robot;
import org.usfirst.frc1123.RecycleRushCode.RobotMap;

public class MoveForward extends Command {

    public MoveForward() {
        requires(Robot.drivetrain);
//        setTimeout(0.5);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.forward();
   	}

    protected boolean isFinished() {
//        return isTimedOut();
    	return false;
    }

    protected void end() {
    	Robot.drivetrain.stop();
    } 

    protected void interrupted() {
    	Robot.drivetrain.stop();
    }
}
