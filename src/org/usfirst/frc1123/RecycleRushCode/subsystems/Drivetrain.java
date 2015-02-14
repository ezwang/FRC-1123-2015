package org.usfirst.frc1123.RecycleRushCode.subsystems;

import org.usfirst.frc1123.RecycleRushCode.RobotMap;
import org.usfirst.frc1123.RecycleRushCode.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Drivetrain extends Subsystem {
    SpeedController leftDrive = RobotMap.drivetrainLeftDrive;
    SpeedController rightDrive = RobotMap.drivetrainRightDrive;
    SpeedController hDrive = RobotMap.drivetrainHDrive;

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoystick());
    }
    
    public void takeJoystickInput(Joystick s) {
    	double angle = s.getDirectionRadians();
    	double magnitude = s.getMagnitude();
    	
    	double sinangle = Math.sin(angle);
    	double cosangle = Math.cos(angle);
    	
    	if(Math.abs(sinangle) > Math.abs(cosangle)) {
    		leftDrive.set(magnitude);
    		rightDrive.set(magnitude);
    	}
    	
    	else {
    		hDrive.set(magnitude);
    	}
    	
    	if(s.getTwist() < 0) {
    		leftDrive.set(1);
    		rightDrive.set(-1);
    	}
    	
    	if(s.getTwist() > 0) {
    		leftDrive.set(-1);
    		rightDrive.set(1);
    	}
    }
}

