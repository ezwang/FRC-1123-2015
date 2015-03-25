package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class GetNextTote extends CommandGroup {
	
	public GetNextTote() {
		addSequential(new MoveForward(), 0.7);
//		addSequential(new DriveWithJoystick());
		
		addSequential(new MoveLifterDown(), 0.1);
//		addSequential(new MoveLifterWithTriggers());
		
		addSequential(new MoveBack(), 0.4);
//		addSequential(new DriveWithJoystick());
		
		addSequential(new MoveLifterDown(), 0.1);
//		addSequential(new StopLifter());

		addSequential(new MoveForward(), 1.0);
//		addSequential(new DriveWithJoystick());

		addSequential(new MoveLifterUp(), 0.5);
//		addSequential(new MoveLifterWithTriggers());
		
		addSequential(new MoveBack(), 0.5);
//		addSequential(new DriveWithJoystick());
	}
	
}
