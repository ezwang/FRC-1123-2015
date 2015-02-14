package org.usfirst.frc1123.RecycleRushCode.subsystems;

import org.usfirst.frc1123.RecycleRushCode.RobotMap;
import org.usfirst.frc1123.RecycleRushCode.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;;


public class Drivetrain extends Subsystem {
    CANTalon leftDrive = RobotMap.drivetrainLeftDrive;
    CANTalon rightDrive = RobotMap.drivetrainRightDrive;
    CANTalon hDrive = RobotMap.drivetrainHDrive;

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoystick());
    }
    
    public void stop() {
		leftDrive.set(0);
		rightDrive.set(0);
		hDrive.set(0);
    }
    
    public void takeJoystickInput(Joystick s) {
    	double x = s.getX();
    	double y = s.getY();
    	double twist = s.getTwist();
    	
//    	if(Math.abs(y) < 0.1 && Math.abs(x) < 0.1 && Math.abs(twist) < 0.1) {
//    		stop();
//    	}
    	
    	
//       	if(Math.abs(y) >= Math.abs(x)) {
       		
       		double leftVal = (-1 * y + twist) * 0.3;
       		double rightVal = (y + twist) * 0.3;
       		       		
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
    	
    	
    	
//    	else {
    		hDrive.set(x);
//    	}
    	
    	System.out.println(s.getTwist());
    	
//    	double angle = s.getDirectionRadians();
//    	double magnitude = s.getMagnitude();
//    	
//    	
//    	System.out.println(magnitude + "\t" + angle);
//    	
//    	double sinangle = Math.sin(angle);
//    	double cosangle = Math.cos(angle);
//    	
//    	if(magnitude < 0.1) {
//    		stop();
//    	}
//    	
//    	if(Math.abs(sinangle) > Math.abs(cosangle)) {
//    		if(cosangle > 0) {
//    			hDrive.set(magnitude);
//    		}
//    		
//    		else {
//    			hDrive.set(-1 * magnitude);
//    		}
//    	}
//
//	
//    	else {
//    		
//    		if(sinangle > 0) {
//	    		leftDrive.set(magnitude);
//	    		rightDrive.set(-1 * magnitude);
//    		}
//    		
//    		else {
//	    		leftDrive.set(-1 * magnitude);
//	    		rightDrive.set(magnitude);
//    		}
//	    	
//	    	
//	    }
   	}
}


