package org.usfirst.frc1123.RecycleRushCode.subsystems;

import javax.management.monitor.GaugeMonitor;

import org.usfirst.frc1123.RecycleRushCode.Robot;
import org.usfirst.frc1123.RecycleRushCode.RobotMap;
import org.usfirst.frc1123.RecycleRushCode.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;;




public class Wings extends Subsystem {

	public CANTalon leftwing = RobotMap.leftWing;
	public CANTalon rightwing = RobotMap.rightWing;
	
	public void initDefaultCommand() {
		setDefaultCommand(new StopWings());
	}
	
	public void stopWings() {
		leftwing.set(0);
		rightwing.set(0);
	}
	
	public void leftUp() {
		leftwing.set(1);
	}
	public void leftDown() {
		leftwing.set(-1);
	}
	
	public void rightUp() {
		rightwing.set(-1);
	}
	public void rightDown() {
		rightwing.set(1);
	}
   
}


