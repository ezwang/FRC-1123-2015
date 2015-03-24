package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1123.RecycleRushCode.Robot;
import org.usfirst.frc1123.RecycleRushCode.RobotMap;

public class BackUp extends Command {

    public BackUp() {
        requires(Robot.drivetrain);
        setTimeout(1.0);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.lifter.open();
    	Robot.drivetrain.back();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.drivetrain.stop();
    } 

    protected void interrupted() {
    }
}
