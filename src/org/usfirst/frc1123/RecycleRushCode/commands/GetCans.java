package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class GetCans extends CommandGroup{

	public GetCans() {
//	Wings Out
//		Precondition: 4 wings (2 sliders) in, all hooks still connected to wings - wings may be slightly out already
//		Lower claw all the way down (provide support at front)
//		Motor on to bring top slider down
//		Limit switch at bottom / elapsed time (if wings partially deployed, time may change), stop bringing top sliders down when switch pressed
//		Postcondition: 4 wings out, all hooks still connected to wings
		
		//lower claw - automatically or set it up with lowered claw
		addSequential(new WingsOut());
		
		
//	Detach hook
//		Precondition: 4 wings out, all hooks still connected to wings
//		All 4 winches in @ 1/2 speed for 1/2 second - this can be longer or shorter depending on how much slack in rope
//		Postcondition: 4 wings out, all 4 hooks detached from wings

		addSequential(new DetachHooks());
		
//	What happens when cans being pulled away?
//		Check current - will rise if motor stuck
//
//	Retract wings and hooks
//		Precondition: 4 wings out, all 4 hooks detached from wings
//		Continue pulling inner hooks back @ 1/2 speed, pull outer hooks @ full speed
//		Bring top sliders up @ full speed
//			Limit switch at top, stop when switch pressed
//		Postcondition: 4 wings in, 4 hooks being pulled in
//
//	Finish retracting hooks:
//		Precondition: 4 wings in, 4 hooks being pulled in
//		All 4 hooks back @ full speed, perhaps slow as cans get close to robot to prevent from crashing into robot
//			Switches next to robot - horizontal bars that recycle bins will hit upon being pulled up - stop when switch pressed
//		Postcondition: 4 wings in, 4 hooks in, all recycle bins hanging next to robot
//
		
		addSequential(new RetractHooksAndWings());
		
//	Back up to scoring zone
	}
	
}
