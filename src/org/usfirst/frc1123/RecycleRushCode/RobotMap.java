package org.usfirst.frc1123.RecycleRushCode;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;


public class RobotMap {
    
    public static CANTalon drivetrainLeftDrive;
    public static CANTalon drivetrainRightDrive;
    public static CANTalon lifterTalon;
    
    public static DoubleSolenoid lifterSolenoid;
    public static DoubleSolenoid lifterSolenoidOther;
    
//    public static DigitalInput enc;
    
    public static Counter enccount;
    

    public static void init() {
        drivetrainLeftDrive = new CANTalon(4);
//        LiveWindow.addActuator("Drivetrain", "LeftDrive", (CANTalon) drivetrainLeftDrive);
        
        drivetrainRightDrive = new CANTalon(2);
//        LiveWindow.addActuator("Drivetrain", "RightDrive", (CANTalon) drivetrainRightDrive);
        
        lifterTalon = new CANTalon(3);
        
        lifterSolenoid = new DoubleSolenoid(7, 0, 1);
        lifterSolenoidOther = new DoubleSolenoid(7, 2, 3);
        
//        enc = new DigitalInput(3); HELLO
        
        enccount = new Counter();
        
        enccount.setUpSource(3);
        
        enccount.setUpSourceEdge(true, false);
        
        
                
    }
}
