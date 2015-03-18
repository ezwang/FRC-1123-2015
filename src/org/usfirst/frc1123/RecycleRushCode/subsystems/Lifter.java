package org.usfirst.frc1123.RecycleRushCode.subsystems;

import org.usfirst.frc1123.RecycleRushCode.RobotMap;
import org.usfirst.frc1123.RecycleRushCode.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;;




public class Lifter extends Subsystem {
	CANTalon lifterTalon = RobotMap.lifterTalon;
	
	DoubleSolenoid lifterSolenoid = RobotMap.lifterSolenoid;
	DoubleSolenoid lifterSolenoidOther = RobotMap.lifterSolenoidOther;
	
	
	
//	DigitalInput enc = RobotMap.enc;
	Counter counter = RobotMap.enccount;
	
	int count = 0;

	public void initDefaultCommand() {
		setDefaultCommand(new StopLifter());
	}

	public void stop() {
		lifterTalon.set(0);
	}
	
	public void moveUp() {
		lifterTalon.set(1);
	}
	
	public void moveDown() {
		lifterTalon.set(-1);
	}
	
	public void open() {
		lifterSolenoid.set(DoubleSolenoid.Value.kForward);
		lifterSolenoidOther.set(DoubleSolenoid.Value.kForward);
		
	}
	
	public void close() {
		lifterSolenoid.set(DoubleSolenoid.Value.kReverse);
		lifterSolenoidOther.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void stopClaw() {
		lifterSolenoid.set(DoubleSolenoid.Value.kOff);
		lifterSolenoidOther.set(DoubleSolenoid.Value.kOff);
	}
	
	public void getEncCount() {
		if(counter.get() != count) {
			System.out.println(counter.get());
			count = counter.get();
		}
	}
    
}


