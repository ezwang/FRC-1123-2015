package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1123.RecycleRushCode.Robot;

public class WingsOut extends Command {

    public WingsOut() {
        requires(Robot.wings);
        setTimeout(1.0);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.wings.left.set(DoubleSolenoid.Value.kForward);
    	Robot.wings.right.set(DoubleSolenoid.Value.kForward);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    } 

    protected void interrupted() {
    }
}
