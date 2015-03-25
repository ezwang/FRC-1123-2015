package org.usfirst.frc1123.RecycleRushCode.subsystems;


import org.usfirst.frc1123.RecycleRushCode.Robot;
import org.usfirst.frc1123.RecycleRushCode.RobotMap;
import org.usfirst.frc1123.RecycleRushCode.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;;




public class Wings extends Subsystem {

	public CANTalon innerwing = RobotMap.innerWings;
	public CANTalon outerwing = RobotMap.outerWings;
	
	public DoubleSolenoid left = RobotMap.leftSolenoid;
	public DoubleSolenoid right = RobotMap.rightSolenoid;
	
	public void initDefaultCommand() {
		setDefaultCommand(new StopWings());
	}
	
	public void stopWings() {
		innerwing.set(0);
		outerwing.set(0);
	}
	
	public void setInner(double d) {
		innerwing.set(d);
	}
	
	public void setOuter(double d) {
		outerwing.set(d);
	}

	public DoubleSolenoid getLeftSolenoid() {
		return left;
	}
	
	public DoubleSolenoid getRightSolenoid() {
		return right;
	}

}


