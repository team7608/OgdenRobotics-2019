/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7608.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static Joystick mainJoystick;
	
	public OI() {
	
	mainJoystick = new Joystick(RobotMap.mainStick);
	//rightJoystick = new Joystick(RobotMap.rStick);
	
	//new JoystickButton(OI.leftJoystick, 0).whenPressed(new DriveCommand());
	//new JoystickButton(OI.rightJoystick, 1).whenPressed(new DriveCommand());


	}
}
