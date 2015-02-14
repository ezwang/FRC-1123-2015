package org.usfirst.frc1123.RecycleRushCode.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1123.RecycleRushCode.Robot;

public class  DriveWithJoystick extends Command {

    public DriveWithJoystick() {
        requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.takeJoystickInput(Robot.oi.getMyJoystick());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
