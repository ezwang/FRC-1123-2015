package org.usfirst.frc1123.RecycleRushCode;
    
import javax.management.monitor.GaugeMonitor;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;


public class RobotMap {
    
    public static CANTalon drivetrainLeftDrive;
    public static CANTalon drivetrainRightDrive;
    public static CANTalon lifterTalon;
    
    public static DoubleSolenoid lifterSolenoid;
    public static DoubleSolenoid lifterSolenoidOther;
    
//    public static AnalogInput pressure;
    
//    public static GaugeMonitor gaugeMonitor;
    
//    public static AnalogInput pressuregauge;
    
    public int hello = 4;
    
    
    public static Encoder encoder;

    public static void init() {
        drivetrainLeftDrive = new CANTalon(4);
//        LiveWindow.addActuator("Drivetrain", "LeftDrive", (CANTalon) drivetrainLeftDrive);
        
        drivetrainRightDrive = new CANTalon(2);
//        LiveWindow.addActuator("Drivetrain", "RightDrive", (CANTalon) drivetrainRightDrive);
        
        lifterTalon = new CANTalon(3);
        
        lifterTalon.reverseSensor(true);
        
        
        
        lifterTalon.enableLimitSwitch(true, false);
        
        
        lifterSolenoid = new DoubleSolenoid(7, 0, 1);
        lifterSolenoidOther = new DoubleSolenoid(7, 2, 3);
        
        
        encoder = new Encoder(4, 5);
        
//        gaugeMonitor = new GaugeMonitor();
        
        
        
        
        
//        pressuregauge = new AnalogInput(4);
        
                
    }
}
