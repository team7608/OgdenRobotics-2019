/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7608.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team7608.robot.commands.MoveHatchPannelUpCommand;
import org.usfirst.frc.team7608.robot.commands.CargoIntakeCommand;
import org.usfirst.frc.team7608.robot.commands.CargoReverseCommand;
import org.usfirst.frc.team7608.robot.commands.CargoStopCommand;
import org.usfirst.frc.team7608.robot.commands.ServoDropCommand;
import org.usfirst.frc.team7608.robot.commands.ServoStopCommand;
import org.usfirst.frc.team7608.robot.commands.HatchMechOpenCommand;
import org.usfirst.frc.team7608.robot.commands.HatchMechCloseCommand;
import org.usfirst.frc.team7608.robot.commands.HatchMechStopCommand;



import org.usfirst.frc.team7608.robot.commands.MoveHatchPannelDownCommand;
import org.usfirst.frc.team7608.robot.commands.MoveHatchPannelStopCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	
	public static Joystick secondJoystick;
	public static JoystickButton a; 
	public static JoystickButton b;
	public static JoystickButton x;
	public static JoystickButton y; 
	public static JoystickButton RTBumper;
	public static JoystickButton LTBumper;
	public static JoystickButton BackButton;
	public static JoystickButton StartButton;
	
	public static Joystick mainJoystick;
	public static JoystickButton mainStickTrigger;
	public static JoystickButton sideStickButton;
	public static JoystickButton leftMainStickButton;
	public static JoystickButton rightMainStickButton;
	public static JoystickButton left5StickButton;
	public static JoystickButton right6StickButton;
	public static JoystickButton Button7;
	public static JoystickButton Button8;
	public static JoystickButton Button9;
	public static JoystickButton Button10;
	public static JoystickButton Button11;
	public static JoystickButton Button12;




	
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
		RTBumper = new JoystickButton(secondJoystick, 5);
		LTBumper = new JoystickButton(secondJoystick, 6);
		BackButton = new JoystickButton(secondJoystick, 7);
		StartButton = new JoystickButton(secondJoystick, 8);

		mainStickTrigger = new JoystickButton(mainJoystick, 1);
		sideStickButton = new JoystickButton(mainJoystick, 2);
		leftMainStickButton = new JoystickButton(mainJoystick, 3);
		rightMainStickButton = new JoystickButton(mainJoystick, 4);
		left5StickButton = new JoystickButton(mainJoystick, 5);
		rightMainStickButton = new JoystickButton(mainJoystick, 6);

		//move up then down when press y button(yellow button)

	


		// if (Robot.hatchlimitSwitch.get()){
		// a.whileHeld(new MoveHatchPannelUpCommand());
		// }
		// else {
		// new MoveHatchPannelStopCommand();
		// }

		// if (Robot.hatchlimitSwitch.get()){
		// 	b.whileHeld(new MoveHatchPannelDownCommand());
		// 	}
		// 	else {
		// 	new MoveHatchPannelStopCommand();
		// 	}
		a.whileHeld(new MoveHatchPannelUpCommand());	
		b.whileHeld(new MoveHatchPannelDownCommand());
		a.whenReleased(new MoveHatchPannelStopCommand());
		b.whenReleased(new MoveHatchPannelStopCommand());


		RTBumper.whileHeld(new CargoIntakeCommand());
		RTBumper.whenReleased(new CargoStopCommand());
		LTBumper.whileHeld(new CargoReverseCommand());
		LTBumper.whenReleased(new CargoStopCommand());


		x.whileHeld(new ServoDropCommand());
		y.whileHeld(new ServoStopCommand());
		

		a.whenPressed(new HatchMechOpenCommand());
		a.whenReleased(new HatchMechCloseCommand());
		StartButton.cancelWhenPressed(new HatchMechOpenCommand());
		//b.whenInactive(new HatchMechStopCommand());
		//(OI.secondJoystick.getRawAxis(3) >=  0.7)
		//driveRobot.arcadeDrive(-OI.mainJoystick.getY(), OI.mainJoystick.getZ());

		
	}
}
