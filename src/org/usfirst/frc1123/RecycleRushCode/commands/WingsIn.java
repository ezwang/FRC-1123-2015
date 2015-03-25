package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1123.RecycleRushCode.Robot;

public class WingsIn extends Command {

    public WingsIn() {
        requires(Robot.wings);
        setTimeout(1.0);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.wings.left.set(DoubleSolenoid.Value.kReverse);
    	Robot.wings.right.set(DoubleSolenoid.Value.kReverse);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    } 

    protected void interrupted() {
    }
}
