/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7608.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team7608.robot.commands.MoveHatchPannelUpCommand;
import org.usfirst.frc.team7608.robot.commands.MoveHatchPannelDownCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static Joystick mainJoystick;
	public static Joystick secondJoystick;
	public static JoystickButton a = new JoystickButton(secondJoystick, 1);
	public static JoystickButton b = new JoystickButton(secondJoystick, 2);
	public static JoystickButton x = new JoystickButton(secondJoystick, 3);
	public static JoystickButton y = new JoystickButton(secondJoystick, 4);

	



	public OI() {
	
		// a.whenPressed(new MoveHatchPannelUpCommand());
		// b.whenPressed(new MoveHatchPannelDownCommand());

mainJoystick = new Joystick(RobotMap.mainStick);
	secondJoystick = new Joystick(RobotMap.secondStick){


		// @Override
		// public double getY(Hand hand) {
		// 	return 0;
		// }
	
		// @Override
		// public double getX(Hand hand) {
		// 	return 0;
		// }
	
		@Override
		public void setRumble(RumbleType type, double value) {
			
		}
	
		@Override
		public void setOutputs(int value) {
			
		}
	
		@Override
		public void setOutput(int outputNumber, boolean value) {
			
		}
	
		@Override
		public HIDType getType() {
			return null;
		}
	
		// @Override
		// public boolean getStickButton(Hand hand) {
		// 	return false;
		// }
	
		@Override
		public boolean getRawButton(int button) {
			return false;
		}
	
		@Override
		public double getRawAxis(int axis) {
			return 0;
		}
	
		@Override
		public int getPOVCount() {
			return 0;
		}
	
		@Override
		public int getPOV(int pov) {
			return 0;
		}
	
		@Override
		public String getName() {
			return null;
		}
	
		// @Override
		// public boolean getBumper(Hand hand) {
		// 	return false;
		// }
	};
	
	//rightJoystick = new Joystick(RobotMap.rStick);
	
	//new JoystickButton(OI.leftJoystick, 0).whenPressed(new DriveCommand());
	//new JoystickButton(OI.rightJoystick, 1).whenPressed(new DriveCommand());
//     public Joystick partnerController = new Joystick(2);
//     public JoystickButton partnerButtonX = new JoystickButton(partnerController, 1);
//     public JoystickButton partnerButtonB = new JoystickButton(partnerController, 3);
//     public JoystickButton partnerButtonA = new JoystickButton(partnerController, 2);
// public JoystickButton partnerButtonY = new JoystickButton(partnerController, 4);


	}
}
