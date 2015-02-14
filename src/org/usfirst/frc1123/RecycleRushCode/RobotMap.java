package org.usfirst.frc1123.RecycleRushCode;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;


public class RobotMap {
    
    public static CANTalon drivetrainLeftDrive;
    public static CANTalon drivetrainRightDrive;
    public static CANTalon drivetrainHDrive;
    

    public static void init() {
        drivetrainLeftDrive = new CANTalon(5);
//        LiveWindow.addActuator("Drivetrain", "LeftDrive", (CANTalon) drivetrainLeftDrive);
        
        drivetrainRightDrive = new CANTalon(6);
//        LiveWindow.addActuator("Drivetrain", "RightDrive", (CANTalon) drivetrainRightDrive);
        
        drivetrainHDrive = new CANTalon(4);
//        LiveWindow.addActuator("Drivetrain", "HDrive", (CANTalon) drivetrainHDrive);
        
    }
}
