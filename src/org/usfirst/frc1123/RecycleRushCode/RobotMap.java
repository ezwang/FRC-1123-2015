package org.usfirst.frc1123.RecycleRushCode;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;


public class RobotMap {
    
    public static CANTalon drivetrainLeftDrive;
    public static CANTalon drivetrainRightDrive;
    public static CANTalon lifterTalon;
    
    public static CANTalon farLeftWing;
    public static CANTalon leftWing;
    public static CANTalon rightWing;
    public static CANTalon farRightWing;
    
    public static DoubleSolenoid lifterSolenoid;
    public static DoubleSolenoid lifterSolenoidOther;
    
    public static DoubleSolenoid leftWingSolenoid;
    public static DoubleSolenoid rightWingSolenoid; 
    
//    public static DigitalInput enc;
    
    public static Counter enccount;
    

    public static void init() {
        drivetrainLeftDrive = new CANTalon(4);
//        LiveWindow.addActuator("Drivetrain", "LeftDrive", (CANTalon) drivetrainLeftDrive);
        
        drivetrainRightDrive = new CANTalon(2);
//        LiveWindow.addActuator("Drivetrain", "RightDrive", (CANTalon) drivetrainRightDrive);
        
        lifterTalon = new CANTalon(3);
        
        farLeftWing = new CANTalon(5);
        leftWing = new CANTalon(6);
        rightWing = new CANTalon(7);
        farRightWing = new CANTalon(8);
        
        
        lifterSolenoid = new DoubleSolenoid(7, 0, 1);
        lifterSolenoidOther = new DoubleSolenoid(7, 2, 3);
        
        leftWingSolenoid = new DoubleSolenoid(7, 4, 5);
        rightWingSolenoid = new DoubleSolenoid(7, 6, 7);
        
//        enc = new DigitalInput(3);
        
        enccount = new Counter();
        
        enccount.setUpSource(3);
        
        enccount.setUpSourceEdge(true, false);
        
        
                
    }
}
