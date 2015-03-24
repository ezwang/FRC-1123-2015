package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ExtractRobot extends CommandGroup {
	public ExtractRobot() {
		addSequential(new BackUp());
		addSequential(new MoveLifterDown(), 0.2);
	}
}
