package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1123.RecycleRushCode.Robot;
import org.usfirst.frc1123.RecycleRushCode.RobotMap;

public class MoveLifterWithTriggers extends Command {

    public MoveLifterWithTriggers() {
        requires(Robot.lifter);
    }

    protected void initialize() {
    }

    protected void execute() {
    	double rightstickvalue = Robot.oi.xBoxStick.getRawAxis(3);
    	double leftstickvalue = Robot.oi.xBoxStick.getRawAxis(2);
    	
    	if(Math.abs(rightstickvalue) > 0.1 && Math.abs(leftstickvalue) < 0.1) {
    		Robot.lifter.moveLifter(rightstickvalue);
    	}
    	
    	else if(Math.abs(leftstickvalue) > 0.1 && Math.abs(rightstickvalue) < 0.1) {
    		Robot.lifter.moveLifter(-1 * leftstickvalue);
    	}
    	
    	else {
    		Robot.lifter.moveLifter(0.0);
    	}
    	
    	Robot.oi.putString("New Left Trigger", (leftstickvalue + "             ").substring(0, 7));
    	Robot.oi.putString("New Right Trigger", (rightstickvalue + "              ").substring(0, 7));
    	
    	Robot.oi.putString("Forward Limit Switch", RobotMap.lifterTalon.isFwdLimitSwitchClosed() + "");
    	
//    	System.out.println(leftstickvalue + "\t" + rightstickvalue);
    	
    	Robot.oi.putString("Talon SRX Encoder", RobotMap.lifterTalon.getEncPosition() + "");
    	
    	
    	
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    } 

    protected void interrupted() {
    }
}
