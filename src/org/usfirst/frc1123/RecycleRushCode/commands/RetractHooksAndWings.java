package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1123.RecycleRushCode.Robot;

public class RetractHooksAndWings extends Command {

    public RetractHooksAndWings() {
        requires(Robot.wings);
        setTimeout(2.0);
    }

    protected void initialize() {
    }

    protected void execute() {
//    	Robot.wings.getFarLeft().set(-1.0);
//    	Robot.wings.getLeft().set(-0.8);
//    	Robot.wings.getRight().set(-1.0);
//    	Robot.wings.getFarRight().set(-0.8);
    	
    	Robot.wings.innerwing.set(-0.7);
    	Robot.wings.outerwing.set(-1.0);
    	
    	Robot.wings.getLeftSolenoid().set(DoubleSolenoid.Value.kForward);
    	Robot.wings.getRightSolenoid().set(DoubleSolenoid.Value.kForward);
    }

    protected boolean isFinished() {
        return isTimedOut(); // Replace with encoder value - check how far motor has spun
    }

    protected void end() {
    	Robot.wings.stopWings();
    } 

    protected void interrupted() {
    }
}
