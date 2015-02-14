package org.usfirst.frc1123.RecycleRushCode.subsystems;

import org.usfirst.frc1123.RecycleRushCode.RobotMap;
import org.usfirst.frc1123.RecycleRushCode.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;

;

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
	
	public double scale(double d) {
		if(d >= 0)
			d = Math.pow(d, 2);
	
		else
			d = -1 * Math.pow(d, 2);
		
		return d;
	}

	public void takeJoystickInput(Joystick s) {
		double x = scale(s.getX());
		double y = scale(s.getY());
		double twist = s.getTwist();

		double leftVal = (-1 * y + twist) * 0.3;
		double rightVal = (y + twist) * 0.3;

		if (rightVal > 1) {
			leftVal /= rightVal;
			rightVal = 1;
		}

		else if (leftVal > 1) {
			rightVal /= leftVal;
			leftVal = 1;
		}

		else if (rightVal < -1) {
			leftVal /= Math.abs(rightVal);
			rightVal = -1;
		}

		else if (leftVal < -1) {
			rightVal /= Math.abs(leftVal);
			leftVal = -1;
		}

		leftDrive.set(leftVal);
		rightDrive.set(rightVal);

		hDrive.set(x);

		System.out.println(s.getTwist());

	}
}
