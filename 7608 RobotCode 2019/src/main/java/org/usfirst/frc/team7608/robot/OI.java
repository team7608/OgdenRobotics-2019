/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7608.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team7608.robot.commands.MoveHatchPannelUpCommand;
import org.usfirst.frc.team7608.robot.commands.CargoIntakeCommand;
import org.usfirst.frc.team7608.robot.commands.MoveHatchPannelDownCommand;
import org.usfirst.frc.team7608.robot.commands.MoveHatchPannelStopCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static Joystick mainJoystick;
	public static Joystick secondJoystick;
	public static JoystickButton a; 
	public static JoystickButton b;
	public static JoystickButton x;
	public static JoystickButton y; 
	//public static Joystick.AxisType RT;
	//public static JoystickButton RB_Bumper;
	//public static JoystickButton LB_Bumper;
	//public static Joystick RT_Trigger;
	//public static Joystick LT_Trigger;


	public OI() {
		mainJoystick = new Joystick(RobotMap.mainStick);
		secondJoystick = new Joystick(RobotMap.secondStick);

		a = new JoystickButton(secondJoystick, 1);
		b = new JoystickButton(secondJoystick, 2);
		x = new JoystickButton(secondJoystick, 3);
		y = new JoystickButton(secondJoystick, 4);
		//RB_Bumper = new JoystickButton(secondJoystick, ?);
		//LB_Bumper = new JoystickButton(secondJoystick, ?);
	



		a.whileHeld(new MoveHatchPannelUpCommand());
		b.whileHeld(new MoveHatchPannelDownCommand());
		a.whenReleased(new MoveHatchPannelStopCommand());
		b.whenReleased(new MoveHatchPannelStopCommand());
		x.whileHeld(new CargoIntakeCommand());

		//(OI.secondJoystick.getRawAxis(3) >=  0.7)
		//driveRobot.arcadeDrive(-OI.mainJoystick.getY(), OI.mainJoystick.getZ());

		
	}
}
