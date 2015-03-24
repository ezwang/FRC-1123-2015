package org.usfirst.frc1123.RecycleRushCode.subsystems;

import org.usfirst.frc1123.RecycleRushCode.RobotMap;
import org.usfirst.frc1123.RecycleRushCode.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;;


public class Drivetrain extends Subsystem {
	CANTalon leftDrive = RobotMap.drivetrainLeftDrive;
	CANTalon rightDrive = RobotMap.drivetrainRightDrive;

	public void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoystick());
	}

	public void stop() {
		leftDrive.set(0);
		rightDrive.set(0);
	}
	
	public void back() {
		leftDrive.set(-0.4);
		rightDrive.set(0.4);
	}
	
	public void takeXBoxInput(Joystick stick) {
		double leftY = stick.getRawAxis(1);
		double rightY = stick.getRawAxis(5);
		
		if(Math.abs(leftY) > 0.1) 
    		leftDrive.set(-1 * leftY);
    	else
    		leftDrive.set(0);
    	
    	if(Math.abs(rightY) > 0.1)
    		rightDrive.set(rightY);
    	else
    		rightDrive.set(0);
    	
		
	}
	
    public void takeTankDriveInput(Joystick left, Joystick right) {
    	    	
    	double leftY = left.getY();
    	
    	double rightY = right.getY();
    	

    		
    	if(Math.abs(leftY) > 0.1) 
    		leftDrive.set(leftY*Math.abs(leftY));
    	else
    		leftDrive.set(0);
    	
    	if(Math.abs(rightY) > 0.1)
    		rightDrive.set(rightY*Math.abs(rightY));
    	else
    		rightDrive.set(0);
    	
    }

	public void takeJoystickInput(Joystick s) {
		double y = s.getY();
		double twist = s.getTwist();

		double leftVal = (-1 * y + twist);
		double rightVal = (y + twist);

		if(rightVal > 1) {
			leftVal /= rightVal;
			rightVal = 1;
		}

		else if(leftVal > 1) {
			rightVal /= leftVal;
			leftVal = 1;
		}

		else if(rightVal < -1) {
			leftVal /= Math.abs(rightVal);
			rightVal = -1;
		}

		else if(leftVal < -1) {
			rightVal /= Math.abs(leftVal);
			leftVal = -1;
		}

		leftDrive.set(leftVal);
		rightDrive.set(rightVal);

		//    	}





	System.out.println(s.getTwist());

}
}


