package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1123.RecycleRushCode.Robot;
import org.usfirst.frc1123.RecycleRushCode.RobotMap;

public class ResetLifterEncoder extends Command {

    public ResetLifterEncoder() {
        
    }

    protected void initialize() {
    }

    protected void execute() {
    	RobotMap.lifterTalon.setPosition(0.0);;
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.lifter.stopClaw();
    } 

    protected void interrupted() {
    }
}
