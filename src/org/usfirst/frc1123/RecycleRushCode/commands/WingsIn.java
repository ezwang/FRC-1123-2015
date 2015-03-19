package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1123.RecycleRushCode.Robot;

public class WingsIn extends Command {

    public WingsIn() {
        requires(Robot.wings);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.wings.retractLeftWings();
    	Robot.wings.retractRightWings();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    } 

    protected void interrupted() {
    }
    
    
}
