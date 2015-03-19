package org.usfirst.frc1123.RecycleRushCode.subsystems;

import org.usfirst.frc1123.RecycleRushCode.RobotMap;
import org.usfirst.frc1123.RecycleRushCode.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;;




public class Wings extends Subsystem {

	DoubleSolenoid leftSolenoid = RobotMap.leftWingSolenoid;
	DoubleSolenoid rightSolenoid = RobotMap.rightWingSolenoid;
	
	//hello!
	
	CANTalon farLeft = RobotMap.farLeftWing;
	CANTalon left = RobotMap.leftWing;
	CANTalon right = RobotMap.rightWing;
	CANTalon farRight = RobotMap.farRightWing;
	
	public void initDefaultCommand() {
		setDefaultCommand(new WingsIn());
	}
	
	public void retractLeftWings() {
		leftSolenoid.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void extendLeftWings() {
		leftSolenoid.set(DoubleSolenoid.Value.kForward);
	}
	
	public void retractRightWings() {
		rightSolenoid.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void extendRightWings() {
		rightSolenoid.set(DoubleSolenoid.Value.kForward);
	}

	public void setMotorValue(CANTalon t, double d) {
		t.set(d);
	}
	
	public CANTalon getFarLeft() {
		return farLeft;
	}
	
	public CANTalon getLeft() {
		return left;
	}
	
	public CANTalon getRight() {
		return right;
	}
	
	public CANTalon getFarRight() {
		return farRight;
	}
}


