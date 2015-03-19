package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1123.RecycleRushCode.Robot;

public class DriveBack extends Command {

    public DriveBack() {
    	requires(Robot.drivetrain);
    	setTimeout(1.0);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.setMotorValues(-1.0, -1.0);
    }

    protected boolean isFinished() {
        return isTimedOut(); 
    }

    protected void end() {

    } 

    protected void interrupted() {
    }
}
