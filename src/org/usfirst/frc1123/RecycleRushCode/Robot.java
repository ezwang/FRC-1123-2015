package org.usfirst.frc1123.RecycleRushCode;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc1123.RecycleRushCode.commands.*;
import org.usfirst.frc1123.RecycleRushCode.subsystems.*;

import edu.wpi.first.wpilibj.CameraServer;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    Command autonomousCommand;

    public static OI oi;
    public static Drivetrain drivetrain;
    public static Lifter lifter;
    public static Wings wings;
    
    public static CameraServer server;
//    public static CameraServer server2;
    
    

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	RobotMap.init();
        drivetrain = new Drivetrain();
        lifter = new Lifter();
        wings = new Wings();
        
        RobotMap.lifterTalon.setPosition(0.0);

        // OI must be constructed after subsystems. If the OI creates Commands 
        //(which it very likely will), subsystems are not guaranteed to be 
        // constructed yet. Thus, their requires() statements may grab null 
        // pointers. Bad news. Don't move it.
        oi = new OI();

        server = CameraServer.getInstance();
        server.setQuality(1);
//        //the camera name (ex "cam0") can be found through the roborio web interface
        server.startAutomaticCapture("cam0");
        
        
        
//        server2 = CameraServer.getInstance();
//        server2.setQuality(1);
//        server.startAutomaticCapture("cam0");
//        server.startAutomaticCapture("cam1");

        
        // instantiate the command used for the autonomous period
        autonomousCommand = new AutonomousCommand();
        SmartDashboard.putData(Scheduler.getInstance());
        
//        Command openClaw = new OpenClaw();
//        
//        SmartDashboard.putData(openClaw);
        
        
        
        SmartDashboard.putData((Subsystem) lifter);
        SmartDashboard.putData((Subsystem) drivetrain);
        
        
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        
//        if(RobotMap.enc.get()) {
//        	System.out.println("Spun!");
//        }
//        
//        if(Robot.oi.chooser.equals("A")) {
//        	server.startAutomaticCapture("cam0");
//        	server.
//        }
//        else {
//        	server.startAutomaticCapture("cam1");
//        }
        
//        System.out.println("CurLevel: " + Robot.oi.curLevel);
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
