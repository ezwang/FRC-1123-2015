package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1123.RecycleRushCode.Robot;

public class InnerIn extends Command {

    public InnerIn() {
        requires(Robot.wings);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.wings.innerwing.set(-1.0);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.wings.stopWings();
    } 

    protected void interrupted() {
    }
}
