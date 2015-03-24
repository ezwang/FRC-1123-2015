package org.usfirst.frc1123.RecycleRushCode;

import org.usfirst.frc1123.RecycleRushCode.commands.*;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.NetworkButton;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released  and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());


	//    public Joystick leftJoystick;
	//    public Joystick rightJoystick;
	//    
	//    public Button up;
	//    public Button down;
	//    

	public Joystick xBoxStick;

	public Button up;
	public Button down;

	public Button open;
	public Button close;
	
	public Button back;
	public SendableChooser chooser;
	
	public NetworkButton softopen;
	public NetworkButton softclose;
	public NetworkButton softup;
	public NetworkButton softdown;
	
	public NetworkButton resetEncoder;
	
	public SendableChooser moveToLevel;
	
	public NetworkButton doMove;
	
	public int curLevel = 2;
	

	public OI() {
		//        leftJoystick = new Joystick(0);
		//        rightJoystick = new Joystick(1);
		//        
		//        up = new JoystickButton(leftJoystick, 5);
		//        
		//        down = new JoystickButton(leftJoystick, 3);
		//        
		//        up.whenPressed(new MoveLifterUp());
		//        up.whenReleased(new StopLifter());
		//        
		//        down.whenPressed(new MoveLifterDown());
		//        down.whenReleased(new StopLifter());

		xBoxStick = new Joystick(0);

		up = new JoystickButton(xBoxStick, 4);
		down = new JoystickButton(xBoxStick, 1);
		back = new JoystickButton(xBoxStick, 6);
		
		up.whenPressed(new MoveLifterUp());
		up.whenReleased(new MoveLifterWithTriggers());
		
		back.whenPressed(new ExtractRobot());
//		back.whenReleased(new DriveWithJoystick());
		
		
		softup = new NetworkButton(NetworkTable.getTable("SmartDashboard"), "TestField");
		softup.whenPressed(new MoveLifterUp());
		softup.whenReleased(new MoveLifterWithTriggers());
		SmartDashboard.putData("Move Up", softup);
		
		softopen = new NetworkButton(NetworkTable.getTable("SmartDashboard"), "TestField");
		softopen.whenPressed(new OpenClaw());
		softopen.whenReleased(new MoveLifterWithTriggers());
		SmartDashboard.putData("Open Claw", softopen);
		
		softdown = new NetworkButton(NetworkTable.getTable("SmartDashboard"), "TestField");
		softdown.whenPressed(new MoveLifterDown());
		softdown.whenReleased(new MoveLifterWithTriggers());
		SmartDashboard.putData("Move Down", softdown);
		
		softclose = new NetworkButton(NetworkTable.getTable("SmartDashboard"), "TestField");
		softclose.whenPressed(new CloseClaw());
		softclose.whenReleased(new MoveLifterWithTriggers());
		SmartDashboard.putData("Close Claw", softclose);
		
		resetEncoder = new NetworkButton(NetworkTable.getTable("SmartDashboard"), "TestField");
		resetEncoder.whenPressed(new SetToZero());
		resetEncoder.whenReleased(new MoveLifterWithTriggers());
		SmartDashboard.putData("Reset Encoder", resetEncoder);	
		
//		SmartDashboard.putInt("Claw Level", curLevel);
		
//		levelup = new NetworkButton(NetworkTable.getTable("SmartDashboard"), "TestField");
//		levelup.whenPressed(new SetTargetLevel());
//		SmartDashboard.putData("Increase Level", levelup);
		
		moveToLevel = new SendableChooser();
		moveToLevel.addDefault("Level 1", 200);
		moveToLevel.addObject("Level 2", 400);
		moveToLevel.addObject("Level 3", 600);
		moveToLevel.addObject("Level 4", 800);
		
		
		SmartDashboard.putData("Move to Level 2", moveToLevel);
		
		doMove = new NetworkButton(NetworkTable.getTable("SmartDashboard"), "TestField");
		doMove.whenPressed(new MoveToLevel());
		doMove.whenReleased(new MoveLifterWithTriggers());
		SmartDashboard.putData("GO", doMove);

		
		
		
//		NetworkTable.getTable("SmartDashboard").putDouble("Pi", 3.14159);
		
//		NetworkTable table = NetworkTable.getTable("SmartDashboard");
		
//		System.out.println(table.getString("Talon SRX Encoder"));
		
//		softopen = new NetworkButton(SmartDashboard., field)

		
		
		down.whenPressed(new MoveLifterDown());
		down.whenReleased(new MoveLifterWithTriggers()); 
				
		open = new JoystickButton(xBoxStick, 3);		
		close = new JoystickButton(xBoxStick, 2);
		
		open.whenPressed(new OpenClaw());
		open.whenReleased(new MoveLifterWithTriggers());
		
		close.whenPressed(new CloseClaw());
		close.whenReleased(new MoveLifterWithTriggers());
		
//		SmartDashboard.putDouble("Tank Pressure", RobotMap.pressure.getVoltage());
		
//		NetworkButton b = new NetworkButton(SmartDashboard, field)
		
//		chooser = new SendableChooser();
//		
//
//			
//		
//		chooser.addDefault("A", "a");
//		chooser.addObject("B", "b");

		
		
//		SmartDashboard.putData("MyChooser", chooser);

				

//		SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
//
//		SmartDashboard.putData("DriveWithJoystick", new DriveWithJoystick());
		
		

	}

	//    public Joystick getLeftJoystick() {
	//        return leftJoystick;
	//    }
	//    
	//    public Joystick getRightJoystick() {
	//    	return rightJoystick;
	//    }
	
	public void putString(String key, String val) {
		SmartDashboard.putString(key,  val);
	}

}

