package org.usfirst.frc1123.RecycleRushCode;

import org.usfirst.frc1123.RecycleRushCode.commands.*;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
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
		
		up.whenPressed(new MoveLifterUp());
		up.whenReleased(new StopLifter());

		down.whenPressed(new MoveLifterDown());
		down.whenReleased(new StopLifter());
		
		open = new JoystickButton(xBoxStick, 3);		
		close = new JoystickButton(xBoxStick, 2);
		
		open.whenPressed(new OpenClaw());
		open.whenReleased(new StopClaw());
		
		close.whenPressed(new CloseClaw());
		close.whenReleased(new StopClaw());
		
		
		
		



		SmartDashboard.putData("Autonomous Command", new AutonomousCommand());

		SmartDashboard.putData("DriveWithJoystick", new DriveWithJoystick());

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

