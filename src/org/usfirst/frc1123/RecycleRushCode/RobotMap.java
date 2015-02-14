package org.usfirst.frc1123.RecycleRushCode;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;


public class RobotMap {
    public static SpeedController drivetrainLeftDrive;
    public static SpeedController drivetrainRightDrive;
    public static SpeedController drivetrainHDrive;

    public static void init() {
        drivetrainLeftDrive = new Talon(0);
        LiveWindow.addActuator("Drivetrain", "LeftDrive", (Talon) drivetrainLeftDrive);
        
        drivetrainRightDrive = new Talon(1);
        LiveWindow.addActuator("Drivetrain", "RightDrive", (Talon) drivetrainRightDrive);
        
        drivetrainHDrive = new Talon(2);
        LiveWindow.addActuator("Drivetrain", "HDrive", (Talon) drivetrainHDrive);
        
    }
}
